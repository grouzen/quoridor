package com.grouzen.quoridor;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.grouzen.quoridor.QuoridorBase;

public class QuoridorDesktop {

	public static void main(String[] args) {
		
		new LwjglApplication(new QuoridorBase(), "Quoridor", 640, 480, true);
	}
	
}
