package com.libgdxtest.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.libgdxtest.screens.MainMenuScreen;

public class HelicopterGame extends Game {

	public static final int WIDTH = 920;
	public static final int HEIGHT = 820;

	public SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}
