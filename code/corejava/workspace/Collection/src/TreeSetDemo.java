import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(34);
		set.add(43);
		set.add(12);
		set.add(122);
		set.add(43);
		set.add(11);
		set.add(34);
		System.out.println(set);
		System.out.println(set.descendingSet());
		
		System.out.println(set.last());
		System.out.println(set.first());
		System.out.println(set.lower(34)); // return the next small values
		System.out.println(set.higher(34)); // return the next grater value
		System.out.println(set.ceiling(35)); // return the value grater and or equals to the provided value
		System.out.println(set.floor(35)); // return the small or equal to values that the provided value.
	}
}
