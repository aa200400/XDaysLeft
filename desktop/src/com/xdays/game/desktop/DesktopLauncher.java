package com.xdays.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.xdays.game.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Game.WIDTH;
		config.height = Game.HEIGHT;
		config.title = Game.TITLE;
		config.resizable = false;
		new LwjglApplication(new Game(), config);
	}
}
