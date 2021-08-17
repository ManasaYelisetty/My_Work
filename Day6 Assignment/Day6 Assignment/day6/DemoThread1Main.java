/* Write a program to create a class DemoThread1 implementing Runnable interface. In the constructor, create a new thread and start the thread. In run() display a message "running child Thread in loop : " display the value of the counter ranging from 1 to 10. Within the loop put the thread to sleep for 2 seconds. In main create 3 objects of the DemoTread1 and execute the program.*/

package day6;

import day6_1.DemoThread1;

public class DemoThread1Main {
	public static void main(String[] args) {
		DemoThread1 thread1 = new DemoThread1();
		thread1.run();
		DemoThread1 thread2 = new DemoThread1();
		thread2.run();
		DemoThread1 thread3 = new DemoThread1();
		thread3.run();

	}

}
