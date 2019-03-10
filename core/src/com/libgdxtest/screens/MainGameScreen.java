package com.libgdxtest.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

import com.libgdxtest.game.HelicopterGame;

public class MainGameScreen implements Screen {

    public static final float SPEED = 240;

	Texture img;
	float x;
	float y;

	HelicopterGame game;

	public MainGameScreen (HelicopterGame game) {
	    this.game = game;
    }

    @Override
    public void show () {
        img = new Texture("badlogic.jpg");
    }

    @Override
    public void render (float delta) {
	    if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			y += adjustedSpeed();
		}

	    if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			y -= adjustedSpeed();
		}

	    if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			x += adjustedSpeed();
		}

	    if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			x -= adjustedSpeed();
		}

        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		game.batch.begin();
		game.batch.draw(img, x, y);
		game.batch.end();
    }

    @Override
    public void resize (int width, int height) {

    }

    @Override
    public void pause () {

    }

    @Override
    public void resume () {

    }

    @Override
    public void hide () {

    }

    @Override
    public void dispose () {

    }

	private float adjustedSpeed () {
	    return SPEED * Gdx.graphics.getDeltaTime();
	}
}
