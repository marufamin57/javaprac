package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import interfaceprac.int1;

public class listdemo {

	public static void main(String[] args) {
//		list1();
//		iterator1();
//		lisiterator1();
//		linkedlist();
		arraydeque();
	}
	static void arraydeque() {
		Deque<Integer> l1= new ArrayDeque<>();
		l1.add(7);
		l1.add(10);
		l1.add(1);
		l1.add(1);
		l1.push(78);
		l1.add(80);
		System.out.println(l1);
//		System.out.println(l1.pop());
		System.out.println(l1.remove());
		System.out.println(l1.pop());
	}
	static void linkedlist() {
		LinkedList<Integer> l1= new LinkedList<>();
		l1.add(7);
		l1.add(10);
		l1.add(1,0);
		l1.add(1,0);
		l1.push(78);
		l1.add(80);
		System.out.println(l1);
//		System.out.println(l1.pop());
		System.out.println(l1.remove());
		System.out.println(l1);
	}
	static void lisiterator1() {
		
		List<Integer> l1=new ArrayList<>();  
		l1.add(7);
		l1.add(10);
		l1.add(1,0);
		System.out.println(l1);
		ListIterator<Integer> listIterator= l1.listIterator();
//		while (listIterator.hasNext()) {
//			int type =listIterator.next();
//			System.out.println(type);
//		}
		for( int i=0;i<20;i++) {
			if (listIterator.hasNext()) {
				System.out.println(listIterator.next());
			}
			if (listIterator.hasPrevious()) {
				System.out.println(listIterator.previous());
			}
		}
		
	}


	static void list1() {
		List<Integer> l1=new ArrayList<>();  
		l1.add(7);
		l1.add(10);
		l1.add(1,0);
		System.out.println(l1);
		for (int integer : l1) {
			if (integer==7) {
				l1.set(l1.indexOf(integer),20 );
//				l1.remove(l1.indexOf(integer));
			}
		}
		System.out.println(l1);
	}
	static void iterator1() {
		List<Integer> l1=new ArrayList<>();  
		l1.add(7);
		l1.add(10);
		l1.add(1,0);
		Iterator<Integer> ite = l1.iterator();
		while (ite.hasNext()) {
			int integer = ite.next();
			System.out.println(integer);
//			if (integer==10) {
//				l1.add(4);
//			}
			
		}
	}

}
