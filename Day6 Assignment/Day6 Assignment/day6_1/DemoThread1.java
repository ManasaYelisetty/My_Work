package day6_1;

public class DemoThread1 implements Runnable {

	public DemoThread1() {
		Thread thread1 = new Thread();
		thread1.start();
	}

	@Override
	public void run() {
		try {
			System.out.println("Running child thread in loop : ");
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(2000);
				System.out.println(i);
			}
		} catch (InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
	}
}
