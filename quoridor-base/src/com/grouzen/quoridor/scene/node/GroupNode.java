package com.grouzen.quoridor.scene.node;

import java.util.HashMap;

public class GroupNode extends SceneNode {
	
	public GroupNode(SceneNode parent) {
		super(parent);
	}

	private HashMap<String, SceneNode> children = new HashMap<String, SceneNode>();
	
	public HashMap<String, SceneNode> getChildren() {
		return this.children;
	}
	
	public void addChild(String name, SceneNode child) {
		this.children.put(name, child);
	}

	@Override
	public void render() {
		
	}
	
}
