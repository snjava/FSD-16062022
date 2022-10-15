
public class FinalDemo {
	public static void main(String[] args) {
		FinalKeyword fk = new FinalKeyword();
		fk.bonusCalculation();
		System.out.println("Gravity Value : " + fk.GRAVITY);
	}
}

final class FinalKeyword {
	final double GRAVITY = 9.8;
	final double PI = 3.14;
	final String CLIENT_NAME = "Abc pvt.ltd.";
	
	public final void bonusCalculation() {
		System.out.println("This is the method to calculate Employee Bonus");
	}	
}

