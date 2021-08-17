/*In the previous program(RenameThread) remove the try{}catch(){} block surrounding the sleep method and try to execute the code. What is your observation*/
package day6;

import java.time.LocalTime;

public class WithoutTryAndCatch {
	public void run() throws InterruptedException {
		Thread.sleep(10000);//We can use throws declaration in place of try and catch block 
		LocalTime time2 = LocalTime.now();

		System.out.println("After the Sleep Current Time : " + time2);
	}

	public static void main(String[] args) {
		RenameThread renameThread = new RenameThread();
		System.out.println("Current Thread Name : " + renameThread.getName());
		renameThread.setName("My Thread");
		LocalTime time = LocalTime.now();
		System.out.println("Before the sleep Current Time : " + time);
		renameThread.start();
		System.out.println("Newly changed thread Name : " + renameThread.getName());
	}
}
