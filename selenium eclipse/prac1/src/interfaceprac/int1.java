package interfaceprac;

public interface int1 {
	default void method1() {
		System.out.println("method 1");
	}
	
	void method2();
	public default void method3() {
		System.out.println("method3 in interface");
	}
}
