package topdown.game;

public class BrownTreeStubTile extends Tile{

	public BrownTreeStubTile(int id){
		super(Assets.brownTreeStub, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
	
	
}
