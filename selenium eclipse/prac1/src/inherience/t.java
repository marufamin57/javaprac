package inherience;

public class t {
	public static void main(String[] args) {
		child c = new child();
		parant p = new parant();
		parant p1= new child();
		c.c1();
		p.p1();
		p1.p1();
		((child) p1).c1();
		c.b1();
		p.b1();
		p1.b1();
		((child) p1).b1();
	}
}
