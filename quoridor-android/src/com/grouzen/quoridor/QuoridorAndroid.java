package com.grouzen.quoridor;

import com.badlogic.gdx.backends.android.AndroidApplication;

import android.os.Bundle;

public class QuoridorAndroid extends AndroidApplication {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initialize(new QuoridorBase(), false);
	}

}
