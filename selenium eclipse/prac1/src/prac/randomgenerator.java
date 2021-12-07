package prac;

import java.util.Random;

public class randomgenerator {

	public static void main(String[] args) {
		System.out.println(intgenerator(1, 100));
		System.out.println(stringgenerator());
		System.out.println(gendergenerator());
	}
	public static int intgenerator(int lower, int upper) {
		Random random=new Random();
		return random.ints(lower, upper+1).findAny().getAsInt();
	}
	public static String stringgenerator() {
		String s="";
		int x=2;
		for (int i = 0; i < x; i++) {
			s=s+(char) intgenerator(97, 122);
		}
		return s;
	}
	public static String gendergenerator() {
		Random random=new Random();
		boolean b=random.nextBoolean();
		if (b) {
			return "m";
		} else {
			return "f";
		}
	}
}
