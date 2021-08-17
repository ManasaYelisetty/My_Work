/*DemoThread1 using extends Thread*/
package day6;

import day6_1.DemoThread2;

public class DemoThread2Main {
	public static void main(String[] args) {
		DemoThread2 demoThread1 = new DemoThread2();
		demoThread1.run();
		DemoThread2 demoThread2 = new DemoThread2();
		demoThread2.run();
		DemoThread2 demoThread3 = new DemoThread2();
		demoThread3.run();

	}

}
