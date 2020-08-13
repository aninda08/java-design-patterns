package com.aninda.practice.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphicObject {
	private String name = "Group";
	private String color;
	public List<GraphicObject> children = new ArrayList<GraphicObject>();
	public GraphicObject() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void print(StringBuilder stringBuilder,  int depth) {
		stringBuilder.append(String.join("", Collections.nCopies(depth, "*")))
	      .append(depth > 0 ? " " : "")
	      .append((color == null || color.isEmpty()) ? "" : color + " ")
	      .append(getName())
	      .append(System.lineSeparator());
	    for (GraphicObject child : children)
	      child.print(stringBuilder,  depth+1);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    print(sb, 0);
	    return sb.toString();
	}
	
}
