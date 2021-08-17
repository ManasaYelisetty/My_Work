package day1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		float average = 0;
		int num1, num2, num3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		average = (float) (num1 + num2 + num3) / 3;
		System.out.println(" Average of three numbers is: " + average);
		scanner.close();
	}

}
