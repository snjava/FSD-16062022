public class ThreadJoinDemo {
	public static void main(String[] args) {
		PatternPrint pattern = new PatternPrint();
		pattern.start();
		try {
			 pattern.join(4000); // main thread pause the execution till the completion of pattenr thread. 
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Started");
		for(int i = 1; i<=10 ; i++) {
			System.out.println(i);
		}
		System.out.println("Main Thread Ends");
	}
}
class PatternPrint extends Thread{
	@Override
	public void run() {
		System.out.println("Pattern Thread Started");
		for(int i = 1 ; i<=5 ; i++) {
			for(int j=1; j<=5 ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("Pattern Thread Ends");
	}
}