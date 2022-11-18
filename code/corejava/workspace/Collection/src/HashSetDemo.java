import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet();
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
