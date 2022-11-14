import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("Abc");
		list.add(12.34);
		list.add('A');
		list.add(123);
		list.add(true);
		list.add("Abc");
		
		System.out.println(list);
		
		list.add(2, "Xyz");
		
		System.out.println(list);
		
		list.remove(0);
		
		System.out.println(list);
		
		
		System.out.println(list.get(3));
		
		
		
		
		
		
		
		
		
		
		list.remove("Abc");
		System.out.println(list);
		
		System.out.println(list.contains(list));
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
		list.clear();
		System.out.println(list);
		
		
	}
}
