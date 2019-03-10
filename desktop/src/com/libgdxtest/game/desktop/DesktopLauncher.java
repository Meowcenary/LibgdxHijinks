package com.libgdxtest.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.libgdxtest.game.HelicopterGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS = 60;
		config.height = HelicopterGame.HEIGHT;
		config.width = HelicopterGame.WIDTH;
		config.resizable = false;
		new LwjglApplication(new HelicopterGame(), config);
	}
}
