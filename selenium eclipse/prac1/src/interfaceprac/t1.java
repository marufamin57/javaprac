package interfaceprac;

public class t1 {
	public static void main(String[] args) {
//		int1 z= new class1();
//		class1 z1= new class1();
//		class1 z2= new subclass1();
//		z.method1();
//		z.method2();
//		z1.method1();
//		z1.method2();
//		z.method3();
//		z1.method3();
//		((class1) z2).method3();
//		System.err.println(z2 instanceof class1);
//		z2.method3();
		class2 q= new subclass2();
		subclass2 q1= new subclass2();
		class2 q2= new class2();
		q.m();
		q1.m();
		q2.m();
		((class2) q1).m();
		System.err.println(q1 instanceof class2);
	}
}
