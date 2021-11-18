package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import interfaceprac.int1;

public class mapdemo  {
	public static void main(String[] args) {
//		hashmap();
		lrucache();
	}
	static void lrucache() {
		LinkedHashMap<String, Integer> lru= new lru<>(1,1,true);
		lru.put("a", 1);
		lru.put("n", 8);
		lru.put("b", 9);
		System.out.println(lru);
		lru.get("a");
		System.out.println(lru);
		lru.put("q", 9);
		System.out.println(lru);
	}
	static void hashmap() {
		Map<String, Integer> map=new HashMap<>();
		map.put("a", 456);
		map.put("lp", 45);
		map.put("n", 456);
		map.put(null, null);
		System.out.println(map);
		System.out.println(map.get("n"));
		System.out.println(map.keySet());
		Set<String> k=map.keySet();
		for (String string : k) {
			System.out.println(map.get(string));
		}
		Map<String, int[]> map1=new HashMap<>();
		int[] ar= {1,2,3};
		int[] ar1=new int[] {1,2,3} ;
		map1.put("q", ar);
		map1.put("e", new int[] {1,48,9});
		System.out.println(map1.get("e"));
	}
	
}

class lru<K, V> extends LinkedHashMap<K, V>{
	final int MAX=3;
	lru (int init, float fl, boolean order){
		super(init,fl,order);
	}
	protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size()>MAX;
    }
}