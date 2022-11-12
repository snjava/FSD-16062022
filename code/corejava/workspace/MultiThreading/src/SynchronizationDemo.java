public class SynchronizationDemo {
	public static void main(String[] args) {
		Printer p = new Printer(); // shared Object
		Thread1 t1 = new Thread1(p);
		Thread2 t2 = new Thread2(p);
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {
	Printer p;
	public Thread1(Printer p) {
		this.p = p;
	}
	public void run() {
		synchronized(p) { // Locked the Printer(p) Object
			for(int i = 1 ; i<=20; i++) {
				p.print(5 * i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if(i == 5) {
					try {
						p.wait(10000); // release the lock and enter into wait state
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				
			}
		}// unlock the Printer(p) object
	}
}

class Thread2 extends Thread {
	Printer p;
	public Thread2(Printer p) {
		this.p = p;
	}
	public void run() {
		synchronized (p) { // Locked the Printer(p) Object (Synchronized block)
			for(int i = 1 ; i<=20; i++) {
				p.print(11 * i);
			}
			p.notify();
		} // unlock the Printer(p) object
	}
}

class Printer {
	public synchronized void print(int value) { // synchronized method
		System.out.println(value);
	}
}
