package genericsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import interfaceprac.int1;
import sun.jvm.hotspot.runtime.StaticBaseConstructor;

public class wildcard {
	public static void main(String[] args) {
		List<String> l1= new ArrayList<>();
		l1.addAll(Arrays.asList("l"));
		List<String> l2= new ArrayList<>();
		l2.add("4");
		System.out.println(isequal(l1, l2));
		System.out.println(isequal1(l1, l2));
	}
	static int isequal(List<?> a, List<?> b) {
		if (a.size()==b.size()) {
			return a.size();
		}else {
			return -1;
		}
	}
	static <T,T1> int isequal1(List<T> a, List<T1> b) {
		if (a.size()==b.size()) {
			return a.size();
		}else {
			return -1;
		}
		
	}
}
