package com.libgdxtest.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

import com.libgdxtest.game.SpaceGame;

public class MainMenuScreen implements Screen {

    SpaceGame game;

    Float baseButtonX, baseButtonY, buttonSpacing;
    Texture[] buttons;
    Texture playButtonActive;
    Texture playButtonInactive;
    Texture exitButtonActive;
    Texture exitButtonInactive;


    public MainMenuScreen (SpaceGame game) {
        this.game = game;

        playButtonActive = new Texture("play_button_active.png");
        playButtonInactive = new Texture("play_button_inactive.png");
        exitButtonActive = new Texture("exit_button_active.png");
        exitButtonInactive = new Texture("exit_button_inactive.png");
        this.buttons = new Texture[]{ exitButtonInactive, playButtonInactive };

        // must explicitly cast to float, java views floating point literals (e.g 0.0) as doubles by default
        baseButtonX = (float) 0;
        baseButtonY = (float) 0;
        buttonSpacing = (float) 80;
    }

    @Override
    public void show () {

    }

    @Override
    public void render (float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		game.batch.begin();

		float iterations = 1;
        for (Texture button : buttons) {
            game.batch.draw(button, baseButtonX, baseButtonY + iterations*buttonSpacing);
            iterations += 1;
        }
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
}
