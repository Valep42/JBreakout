package game;

import org.lwjgl.input.Keyboard;

import control.Controllable;
import control.Controls1D;

public class Player {
	private Controllable controlling;
	private Controls1D controls;
	private int score;
	private int lives;

	public Player(Controllable controlling, Controls1D controls, int score,
			int lives) {
		
		this.controlling = controlling;
		this.controls = controls;
		this.score = score;
		this.lives = lives;
	}

	public void control(int delta) {
		if (Keyboard.isKeyDown(controls.getMoveLeft())) {
			this.controlling.moveHorizontally(delta, -1);
		}
		if (Keyboard.isKeyDown(controls.getMoveRight())) {
			this.controlling.moveHorizontally(delta, 1);
		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	
}