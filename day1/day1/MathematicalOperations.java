package day1;

import java.util.Scanner;

public class MathematicalOperations {

	public static void main(String[] args) {
		int firstNum, secondNum, add, subtract, multiply;
		float divide;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		firstNum = scanner.nextInt();
		secondNum = scanner.nextInt();

		add = firstNum + secondNum;
		subtract = firstNum - secondNum;
		multiply = firstNum * secondNum;
		divide = firstNum / secondNum;

		System.out.println(" Sum: " + add);
		System.out.println(" Difference: " + subtract);
		System.out.println(" Multiplication: " + multiply);
		System.out.println(" Division: " + divide);
		scanner.close();

	}

}
