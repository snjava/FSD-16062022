import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(12, "Abc");
		map.put(123, null);
		map.put(112, 234);
		map.put(11, 'A');
		map.put(34, "Abc");
		map.put(21, true);
		map.put(12, "Xyz");
		
		System.out.println(map);
		
		System.out.println(map.ceilingEntry(21));
		System.out.println(map.higherEntry(21));
		System.out.println(map.floorEntry(21));
		System.out.println(map.lowerEntry(21));
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
		
		System.out.println(map.ceilingKey(21));
		System.out.println(map.higherKey(21));
		System.out.println(map.floorKey(21));
		System.out.println(map.lowerKey(21));
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		
		
	}
}
