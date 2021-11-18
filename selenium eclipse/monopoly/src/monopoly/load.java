package monopoly;

import processing.core.PApplet;
import processing.core.PImage;

public class load extends PApplet {
	public static void main(String[] args) {
		PApplet.main("monopoly.load");
	}

	public void settings() {
		size(1000, 1000);
	}

	public void setup() {
//		PImage img = loadImage("lib/a.png");
	}

	public void draw() {
		PImage img = loadImage("lib/a.png");
		image(img, 0, 0);
	}

}
