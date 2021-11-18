package prac;

import java.util.ArrayList;

public class t1 {
	public static void main(String[] args) {
		Integer integer=Integer.valueOf(40);
		System.out.println(integer);
		ArrayList as= new ArrayList<>();
		as.add(4);
		as.add("7y");
		
		for (int i=0; i<as.size();i++) {
			System.out.println(as.get(i));
		}
	}

}
