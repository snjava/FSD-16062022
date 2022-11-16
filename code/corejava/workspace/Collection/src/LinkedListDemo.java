import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(345);
		list.add("Abc");
		list.add(50.1);
		list.add("Abc");
		
		System.out.println("Original List : " + list);
		
		list.push(111);
		System.out.println("After Push : " +list);
		
		// it selects and remove 1st element, if 1st element is not present then it will
		// throw an Exception
		System.out.println("Pop Element : " + list.pop());
		System.out.println("After pop : " +list);
		
		list.addFirst(333);
		list.addLast("ZZZ");
		System.out.println("add first & last : " +list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println("remove first & last : " +list);
		
		
		System.out.println("Peek Element : " + list.peek());
		System.out.println("After peek : " +list);
		
		// it selects and remove 1st element, if 1st element is not present then it will
		// return null
		System.out.println("poll Element : " + list.poll());
		System.out.println("After poll : " +list);
	}

}
