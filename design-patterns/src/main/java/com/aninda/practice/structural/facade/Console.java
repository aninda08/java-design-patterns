package com.aninda.practice.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Console {
	private List<Viewport> viewports = new ArrayList<>();
	private int width, height;
	public Console(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void addViewport(Viewport viewport) {
		viewports.add(viewport);
	}
	
	/**
	 * Facade method
	 * 
	 * @param width
	 * @param height
	 * @return 
	 */
	public static Console newConsole(int width, int height) {
		Buffer buffer = new Buffer(width, height);
		Viewport viewport = new Viewport(buffer, width, height, 0, 0);
		Console console = new Console(width, height);
		console.addViewport(viewport);
		return console;
	}
	
	public void render() {
		for(int x=0; x < height; x++) {
			for(int y=0; y < width; y++) {
				for(Viewport viewport:viewports) {
					System.out.print(viewport.charAt(x, y));
				}
				System.out.println();
			}
		}
	}
}
