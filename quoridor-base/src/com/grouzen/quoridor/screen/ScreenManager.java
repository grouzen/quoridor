package com.grouzen.quoridor.screen;

import java.util.ArrayList;

public class ScreenManager {
	
	private static ScreenManager instance = null;
	
	private int stackTop = -1;
	private ArrayList<Screen> stack = new ArrayList<Screen>();
	
	public static ScreenManager getInstance() {
		if(instance == null) {
			instance = new ScreenManager();
		}
		
		return instance;
	
	}
	
	public Screen getCurrentScreen() {
		Screen screen = null;
		
		if(stack.size() > 0) {
			screen = getScreen(stackTop);
		}
		
		return screen;
	}
	
	public Screen getScreen(int position) {
		Screen screen = null;
		
		if(position >= 0 && position < stack.size()) {
			screen = stack.get(position);	
		}
		
		return screen;
	}
	
	public int pushScreen(Screen screen) {
		stack.add(screen);
		stackTop++;
		
		return stackTop;
	}
	
	public Screen popScreen() {
		Screen screen = null;
		
		if(stackTop >= 0) {
			screen = stack.get(stackTop);
			stackTop--;
		}
		
		return screen;
	}
		
	
}
