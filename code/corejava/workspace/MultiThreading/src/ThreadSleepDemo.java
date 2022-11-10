public class ThreadSleepDemo {
	public static void main(String[] args) {
		SleepDemo demo = new SleepDemo(); // New/Born Stage
		demo.start(); // Runnable Stage
		
		for(int i =1 ; i<=10 ; i++) {
			System.out.println("13 * " + i + " = " + (13*i));
		}
	}
}
class SleepDemo extends Thread {
	@Override
	public void run() { // Running Stage
		for(int i =1 ; i<=10 ; i++) {
			System.out.println("10 * " + i + " = " + (10*i));
			try {
				Thread.sleep(1000); // Pause Stage
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
