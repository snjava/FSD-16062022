
public class ThreadSleepDemo {
	public static void main(String[] args) {
		
		SleepDemo demo = new SleepDemo();
		demo.start();
		
		for(int i =1 ; i<=10 ; i++) {
			System.out.println("13 * " + i + " = " + (13*i));
		}
	}
}


class SleepDemo extends Thread {
	@Override
	public void run() {
		for(int i =1 ; i<=10 ; i++) {
			System.out.println("10 * " + i + " = " + (10*i));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
