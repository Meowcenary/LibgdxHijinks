package com.libgdxtest.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Screen;

import com.libgdxtest.game.HelicopterGame;

public class MainMenuScreen implements Screen {

    private static final float BASE_BUTTON_Y = 100;
    private static final float BUTTON_SPACING_Y = 80;

    HelicopterGame game;

    private Button[] buttons;

    public MainMenuScreen (HelicopterGame game) {
        this.game = game;
        Button playButton = new Button("play_button_active.png", "play_button_inactive.png", 70, 200);
        Button exitButton = new Button("exit_button_active.png", "exit_button_inactive.png", 70,200);

        this.buttons = new Button[]{ exitButton, playButton };
    }

    @Override
    public void show () {

    }

    @Override
    public void render (float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		game.batch.begin();
        drawButtons();
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

    private void drawButtons() {
		float iterations = 1;
        for (Button button : buttons) {
            float xDrawStart = xButtonSpacing(button);
            float yDrawStart = BASE_BUTTON_Y + iterations* BUTTON_SPACING_Y;

            if (betweenButtonWidth(button) && betweenButtonHeight(button, yDrawStart)) {
                game.batch.draw(button.activeImage, xDrawStart, yDrawStart);
            }
            else {
                game.batch.draw(button.inactiveImage, xDrawStart, yDrawStart);
            }
            iterations += 1;
        }
    }

    // to draw in center: HelicopterGame.WIDTH / 2 - BUTTON_WIDTH / 2
    private float xButtonSpacing(Button button) {
        return HelicopterGame.WIDTH / 2 - button.width / 2;
    }

    private boolean betweenButtonWidth(Button button) {
        if ((xButtonSpacing(button) < Gdx.input.getX()) && (Gdx.input.getX() < HelicopterGame.WIDTH - xButtonSpacing(button))) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean betweenButtonHeight(Button button, float yDrawStart) {
        if ((HelicopterGame.HEIGHT - Gdx.input.getY() < yDrawStart + button.height) && (HelicopterGame.HEIGHT - Gdx.input.getY() > yDrawStart)) {
            return true;
        }
        else {
           return false;
        }
    }
}
