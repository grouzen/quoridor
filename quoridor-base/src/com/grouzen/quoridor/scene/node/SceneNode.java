package com.grouzen.quoridor.scene.node;

public abstract class SceneNode {
	
	private SceneNode parent;
	
	public SceneNode(SceneNode parent) {
		this.parent = parent;
	}
	
	public abstract void render();
}
