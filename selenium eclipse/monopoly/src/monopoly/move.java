package monopoly;

import java.util.Scanner;

import processing.core.*;

public class move extends PApplet {
	public static void main(String[] args) {
		int count = 0;
		int pc = 0;
		String[] player = { "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8" };
		int[] mair = { 0, 0, 0 };
		Scanner scanner = new Scanner(System.in);
		while (true) {
			count = 0;
			while (count <= 2) {
				System.out.println("player " + player[pc % 8]);
				if (scanner.nextLine().contains("1")) {
					mair = roll();
				}
				System.out.println("roll " + mair[0] +" "+ mair[1]);
				if (mair[2] == 1) {
					count++;
				} else {
					break;
				}
			}
			pc++;
//			System.err.println("want to exit press x or next player");
//			if (scanner.nextLine().contains("x")) {
//				break;
//			}else {
//				continue;
//			}
		}
	}

	static int[] roll() {
		PApplet q1 = new PApplet();
		int roll1 = floor(q1.random(1, 7));
		int roll2 = floor(q1.random(1, 7));
		int[] temp = { roll1, roll2, 0 };
		if (roll1 == roll2) {
			temp[2] = 1;
		}
		return temp;
	}
}
