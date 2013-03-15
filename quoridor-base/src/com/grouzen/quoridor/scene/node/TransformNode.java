package com.grouzen.quoridor.scene.node;

import com.badlogic.gdx.math.Vector3;

public class TransformNode extends GroupNode {
	
	private Vector3 rotation;
	private Vector3 translation;
	private Vector3 scale;
	
	public TransformNode(SceneNode parent) {
		super(parent);
		
		this.rotation = new Vector3(0, 0, 0);
		this.translation = new Vector3(0, 0, 0);
		this.scale = new Vector3(0, 0, 0);
	}
}
