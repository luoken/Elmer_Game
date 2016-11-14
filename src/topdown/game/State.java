package topdown.game;

import java.awt.Graphics;

public abstract class State {
	
	private static State currentState = null;

	protected Handler handler;
	
	public State(Handler handler){
		this.handler = handler;
	}
	
	public static void setState(State state){
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	
	//class
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	
}
