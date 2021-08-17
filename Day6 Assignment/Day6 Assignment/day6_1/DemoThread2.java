package day6_1;

public class DemoThread2 extends Thread {
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

	public DemoThread2() {

		Thread thread2 = new Thread();
		thread2.start();
	}

}
