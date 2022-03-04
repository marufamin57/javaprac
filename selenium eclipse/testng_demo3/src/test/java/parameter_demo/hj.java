package parameter_demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class hj {
public static void main(String[] args) {
	Vector<Vector<Object>> vector=new Vector<Vector<Object>>();
	vector.add(new Vector<Object>());
	vector.add(new Vector<Object>());
	vector.get(0).addAll(Arrays.asList("a",new Integer(7)));
	vector.get(1).addAll(Arrays.asList("b",new Integer(78)));
	Iterator<Vector<Object>> iterator=vector.iterator();
	System.out.println(iterator.next().get(0));
	System.out.println(iterator.next().get(0));
	
}
}
