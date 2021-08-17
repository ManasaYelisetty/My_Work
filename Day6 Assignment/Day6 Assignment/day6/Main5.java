/*5 Write a program to create a class Number  which implements Runnable. Run method displays the multiples of a number accepted as a parameter. In main create three objects - first object should display the multiples of 2, second should display the multiples of 5 and third should display the multiples of 8. Display appropriate message at the beginning and ending of thread. The main thread should wait for the first object to complete. Display the status of threads before the multiples are displayed and after completing the multiples.*/

package day6;

abstract class Number implements Runnable {
	public void run(int num) {
		System.out.println("Displaying the multiples of : " + num);
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(num);
		System.out.println("Those are the multiples of : " + num);
	}

	public Number() {
		Thread thread = new Thread();
		thread.start();
	}
}

class NumberImpl extends Number {
	@Override
	public void run() {
	}
}

public class Main5 {
	public static void main(String[] args) {
		Number number = new NumberImpl();
		number.run(2);
		Number number1 = new NumberImpl();
		number1.run(5);
		Number number2 = new NumberImpl();
		number2.run(8);
	}
}
