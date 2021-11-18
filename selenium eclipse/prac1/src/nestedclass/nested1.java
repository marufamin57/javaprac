package nestedclass;

import interfaceprac.class1;
import interfaceprac.int1;

public class nested1 {
	public static void main(String[] args) {
		nested1 q1= new nested1();
		ball b1= q1.setball(10, "bnm");
		nested1.ball1 b2=new nested1.ball1(20);
		b2.m1();
		System.out.println(b2.getr());
		System.out.println(b1.getcol());
		// anonymous nested class
		new foo(456) {
			void go() {
				System.out.println("inside anonymous");
			}
		}.go();
		
		
	}
	private  class ball{
		int r;
		String col;
		ball(int r,String col) {
			this.r=r;
			this.col=col;
		}
		int getr() {
			return r;
		}
		String getcol() {
			return col;
		}
	}
	private static class ball1{
		int r;
		ball1(int r){
			this.r=r;
		}
		void m1() {
			System.out.println("static inner class");
		}
		int getr() {
			return r;
		}
	}
	
	ball setball(int a, String b ) {
		return new ball(a,b);
	}
	
	
}
class foo{
	int q= 0;
	foo(int q){
		this.q=q;
	}
}
 