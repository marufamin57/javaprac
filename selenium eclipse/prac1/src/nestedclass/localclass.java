package nestedclass;

public class localclass {
public static void main(String[] args) {
	meth1();
}
	static void meth1() {
		int count=50;
		
		class local{
			void locmeth1() {
				System.out.println("inside local class");
				System.out.println(count);
			}
		}
		new local().locmeth1();
	}
}
