package day1;

import java.util.Scanner;

class SumOfSquares {
	public static int sumOfSquaresOfEvenDigits(int num1) {
		int sum = 0, remainder;
		while (num1 > 0) {
			remainder = num1 % 10;
			if (num1 % 2 == 0)
				sum = sum + (remainder * remainder);
			num1 = num1 / 10;
		}
		return sum;
	}

}

public class Main2 {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int ans = SumOfSquares.sumOfSquaresOfEvenDigits(num1);
		System.out.println("Sum of squares of even digit is: " + ans);
		scanner.close();
	}
}
