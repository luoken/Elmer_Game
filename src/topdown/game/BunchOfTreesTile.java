package topdown.game;

public class BunchOfTreesTile extends Tile{

	public BunchOfTreesTile(int id) {
		super(Assets.bunchOfTrees, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
