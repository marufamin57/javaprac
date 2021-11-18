package herats;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import processing.core.PApplet;

public class hearts extends PApplet {
	static List<String> cards = new Vector<>();
	static List<String> p1 = new Vector<>();
	static List<String> p2 = new Vector<>();
	static List<String> p3 = new Vector<>();
	static List<String> p4 = new Vector<>();

	public static void main(String[] args) {
		PApplet.main("herats.hearts");
	}

	public void settings() {
		size(1000, 1000);
		Start();
	}

	public void setup() {
		frameRate(1);
		textSize(40);
	}

	public void draw() {
		background(0);
		text(p1.toString(), 100, 100);
		text(p2.size()+"*********************", 100, 200);
		text(p3.size()+"*********************", 100, 300);
		text(p4.size()+"*********************", 100, 400);
	}

	static void Start() {
		cards.addAll(Arrays.asList("A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "AJ",
				"AQ", "AK", "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "BJ", "BQ", "BK", "C1", "C2",
				"C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK", "D1", "D2", "D3", "D4", "D5", "D6",
				"D7", "D8", "D9", "D10", "DJ", "DQ", "DK"));
		Collections.shuffle(cards);
//		System.out.println(cards);
		p1.addAll(cards.subList(0, 13));
		p2.addAll(cards.subList(13, 26));
		p3.addAll(cards.subList(26, 39));
		p4.addAll(cards.subList(39, 52));
		Collections.sort(p1);
	}
}
