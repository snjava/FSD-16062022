import java.util.ArrayList;
import java.util.Iterator;

public class CustomObjectCollection {

	public static void main(String[] args) {
		Employee e1 = new Employee(12, "A", "a@gmail.com");
		Employee e2 = new Employee(121, "B", "b@gmail.com");
		Employee e3 = new Employee(123, "C", "c@gmail.com");
		Employee e4 = new Employee(21, "D", "d@gmail.com");
		Employee e5 = new Employee(43, "E", "e@gmail.com");
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		
		System.out.println("============Iterator=================");
		Iterator<Employee> it = emplist.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.getId() + "\t" + emp.getName());
		}
		
		System.out.println("============For Loop=================");
		for(Employee emp : emplist) {
			System.out.println(emp.getId() + "\t" + emp.getName());
		}
		
	}

}
