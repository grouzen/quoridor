package com.grouzen.quoridor;

import com.badlogic.gdx.ApplicationListener;
import com.grouzen.quoridor.screen.GameplayScreen;
import com.grouzen.quoridor.screen.Screen;
import com.grouzen.quoridor.screen.ScreenManager;

public class QuoridorBase implements ApplicationListener {

	private ScreenManager screenManager;
	
	@Override
	public void create() {
		screenManager = ScreenManager.getInstance();
		
		// TODO: change GameplayScreen to MainMenuScreen
		screenManager.pushScreen(new GameplayScreen());

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render() {
		Screen currentScreen = screenManager.getCurrentScreen(); 
		currentScreen.render();
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}

}
