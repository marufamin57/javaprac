package genericsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Vector;


public class genericsmethod {
	static List<Number> z;
	public static void main(String[] args) {
		String[] q= {"a","m"};
		System.out.println(q);
		System.out.println(array2vector(q));
		List<Integer> z= new ArrayList<>();
		z= Arrays.asList(7,8,2);
		List<Double> z1= new ArrayList<>();
		z1= Arrays.asList(70.0,8.0,2.6);
		System.out.println(boundedgen(z));
		System.out.println(boundedgen(z1));
		System.out.println(boundedgen2(z));
		System.out.print(boundedgen2(z1));
	}
	
	static <T extends Number> double boundedgen2(List<T> z) {
		double temp=0;
			for (T t : z) {
				temp= temp+t.doubleValue();
			}
			return temp;
	}

	static double boundedgen(List<? extends Number> z) {
		double temp= 0;
		
		for (Number number : z) {
			temp=temp + number.doubleValue();
		}
		return temp;
		
	}
	static <T> Vector<T> array2vector(T[] a){
		Vector<T> z = new Vector<>();
		for (int i = 0; i < a.length; i++) {
			z.add(a[i]);
		}
		return z;
	}
}
