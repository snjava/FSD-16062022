public class CustomThreadDemo1 {
	public static void main(String[] args) {
		System.out.println("Main Thread started...");
		
		MyThread t1 = new MyThread();
		t1.setName("Mythread");
		t1.setPriority(10); 
		t1.start(); // you can make thread ready to run.
		
		System.out.println("Main Thread Ends...");
	}
}


class MyThread extends Thread {
	@Override
	public void run() {
		Thread obj = Thread.currentThread();
		System.out.println(obj);
		System.out.println("This is my First Custom Thread...");
	}
}
