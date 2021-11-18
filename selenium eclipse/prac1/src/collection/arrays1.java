package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arra();
	}
	static void arra() {
		String[] arr= {"a","b","c","1"};
//		System.out.println(arr);
		List<String> ar= Arrays.asList(arr);
		ArrayList<String> a1= new ArrayList<>(ar);
		System.out.println(ar);
		Arrays.fill(arr, "z");
		System.out.println(Arrays.toString(arr));
		Collections.addAll(a1, arr);
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println(Collections.binarySearch(a1, "1"));
		Collections.shuffle(a1);
		System.out.println(a1);
		System.out.println(Collections.frequency(a1, "z"));
	}

}
