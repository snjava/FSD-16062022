import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		map.put("A", 123);
		map.put(12.34, 'A');
		map.put(111, "Abc");
		map.put(32.45, 123);
		map.put("A", 555);
		map.put(false, 123);
		System.out.println(map);
		
		System.out.println(map.containsKey(111));
		System.out.println(map.containsValue(555));
		
		map.remove(12.34);
		System.out.println("After Remove : " + map);
		
		System.out.println(map.get("A"));
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
	}
}
