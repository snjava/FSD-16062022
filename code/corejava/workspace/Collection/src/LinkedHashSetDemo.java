import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add("abc");
		set.add("pqr");
		set.add(23423);
		set.add(234.23);
		set.add('A');
		set.add("abc");
		set.add(true);
		set.add(23423);
		System.out.println(set);
	}
}
