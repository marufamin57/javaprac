package genericsdemo;

public class gen1 {
public static void main(String[] args) {
	all<String> zx= new ball<>();
	all<Number> zx1= new ball<>();
	zx.set("-");
	System.out.println(zx.get());
	zx1.set(78.45);
}
}

interface all<T>{
	void set(T a);
	T get();
}
class ball<T> implements all<T>{
	private T a;
	@Override
	public void set(T a) {
		// TODO Auto-generated method stub
		this.a=a;
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return a;
	}
	
}
