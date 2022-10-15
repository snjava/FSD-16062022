public class ClassObject {
	public static void main(String arr[]) {
		Product prod1; // reference variable
		prod1 = new Product(); // Object of the class
		System.out.println(prod1);  // ClassName@HashCode
		System.out.println(prod1.id); // access variable using object
		System.out.println(prod1.price);
		System.out.println(prod1.quantity);
		
		prod1.id = 111;
		prod1.price = 200;
		prod1.quantity = 4;

		prod1.displayProductDetails();
	}
}
class Product {
	int id;
	double price;
	int quantity;
	public void displayProductDetails() {
		System.out.println("Id = " + id);
		System.out.println("Price = " + price);
		System.out.println("Quantity = " + quantity);
		double total = getTotal();
		System.out.println("Total Price = " + total);
	}
	public double getTotal() {
		return (price*quantity); // in-line return
	}
}

