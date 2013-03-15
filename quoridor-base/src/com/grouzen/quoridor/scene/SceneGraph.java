package com.grouzen.quoridor.scene;

import com.grouzen.quoridor.scene.node.SceneNode;

public abstract class SceneGraph {
	
	private SceneNode root;
	
	public void render() {
		root.render();
	}
}
