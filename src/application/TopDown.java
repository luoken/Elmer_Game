package application;

import javafx.scene.layout.Pane;

import topdown.game.Game;

public class TopDown implements OpMode{

	Control control = null;
	Game game = new Game("Tile Game!", 1200, 800);
	Pane pane = new Pane();
	
	
	@Override
	public void setControl(Control control) {
		this.control = control;
	}

	@Override
	public Pane getPane() {
		return pane;
	}

	@Override
	public void start() {
		game.start();
	}

	@Override
	public void pause() {
		game.stop();
	}

	@Override
	public void resume() {
		game.start();
	}

	@Override
	public void end() {
		game.stop();
	}

	@Override
	public void load(String filename) {
		
	}
	

}
