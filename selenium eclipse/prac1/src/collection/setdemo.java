package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hashset();
//		linkedhashset();
		navigable();
	}
	static void navigable() {
		TreeSet<Integer> set= new TreeSet<>();
		int[] as={7,8,10,20,41,-8,-1,0};
		for (int i : as) {
			set.add(i);
		}
		System.out.println(set);
		System.out.println(set.headSet(0, true));
		System.out.println(set.subSet(0, 20));
		System.out.println(set.descendingSet());
		
	}
	static void hashset() {
		Set<String> s = new HashSet<>(); //not sorted
		s.add("b");
		s.add("4");
		s.add("a");
		s.add("1");
		System.out.println(s);
	}
	static void linkedhashset() {
		Set<String> s = new LinkedHashSet<>(); //not sorted
		s.add("a");
		s.add("4");
		s.add("a");
		s.add("1");
		System.out.println(s);
	}
}
