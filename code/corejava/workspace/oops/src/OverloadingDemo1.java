public class OverloadingDemo1 {
	public static void main(String[] args) {
		Calculate cal = new Calculate();
		cal.add(23.34, 34.56);
		cal.add(23,45);
		cal.add(34,56,12);
	}
}

class Calculate {
	public void add(int n1, int n2) {
		int add = n1 + n2;
		System.out.println("Add of 2 int : " + add);
	}
	
	protected void add(double n1, double n2) {
		double add = n1 + n2;
		System.out.println("Add of 2 double : " + add);
	}
	
	void add(int n1, int n2, int n3) {
		int add = n1 + n2 + n3;
		System.out.println("Add of 3 int : " + add);
	}
	
	private void add(int n1, double n2) {
		double add = n1 + n2;
		System.out.println("Add of 2 double : " + add);
	}
	
	public double add(double n1, int n2) {
		double add = n1 + n2;
		System.out.println("Add of 2 double : " + add);
		return add;
	}
}



