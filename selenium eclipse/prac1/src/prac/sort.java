package prac;

import java.util.Iterator;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {20,70,80,4,20,10,1,0,-1};
		arr=sort2(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	static int[] sort1(int[] arr) {
		int[] arr1= new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=arr[i];
		}
		for (int j = arr.length; j > 1; j--) {
			for (int i=0; i<j-1;i++) {
				int temp=arr1[i];
				if (arr1[i+1]<temp) {
					arr1[i]=arr1[i+1];
					arr1[i+1]=temp;
				}
			}
		}
		
		return arr1;
		
	}
	static int[] sort2(int[] arr) {
	int[] temp=	sort1(arr);
		for (int i = 0; i < temp.length/2; i++) {
			int t= temp[i];
			temp[i]=temp[temp.length-1-i];
			temp[temp.length-1-i]=t;
		}
		return temp;
	}

}
