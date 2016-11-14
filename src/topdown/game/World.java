package topdown.game;

import java.awt.Graphics;

public class World {
	
	private Handler handler;
	private int width, height;
	private int[][] tiles;
	public EntityManager getEntityManager() {
		return entityManager;
	}

	private int spawnX, spawnY;
	
	private EntityManager entityManager;
	
	public World(Handler handler, String path){
		this.handler = handler;
		entityManager = new EntityManager(handler, new Player(handler, 100, 100));
		entityManager.addEntity(new Player(handler, 100, 100));
		loadWorld(path);
		
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);

		
	}
	
	public void tick(){
		entityManager.tick();
	}
	
	public void render(Graphics g){
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth())/Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0,  handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		for(int y = yStart; y < yEnd; y++){
			for(int x = xStart; x < xEnd; x++){
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), 
						(int) (y* Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		
		entityManager.render(g);
	}
	
	public Tile getTile(int x, int y){
		if(x < 0 || y < 0 || x >= width || y >= height){
			return Tile.grassTile;
		}
		
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.grassTile;
		return t;
	}
	
	public void loadWorld(String path){
		width = 10;
		height = 10;
		tiles = new int[width][height];
		
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				tiles[x][y] = 0;
			}
		}
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				if(x == 0 || x == width-1){
					tiles[x][y] = 2;
				}
				if(y == 0 || y == height-1){
					tiles[x][y] = 2;
				}
			}
			
		}
		
	}
	
//	public int getWidth(){
//		return width;
//	}	
//	
//	public int getHeight(){
//		return height;
//	}
}
