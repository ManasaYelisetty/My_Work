package day2;

import java.util.Scanner;

class A {
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

}

 class B extends A {
	public int multiplication(int num1, int num2) {
		return num1 * num2;
	}

}

public class Inherit {
	public static void main(String[] args) {
				System.out.println("Enter 2 Numbers: ");
				Scanner scanner = new Scanner(System.in);
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
					B b = new B();
				System.out.println("Addition of two numbers: " + b.add(num1, num2));
				System.out.println("Subtraction of two numbers is : " + b.sub(num1, num2));
				System.out.println("Multiplication of two numbers is: " + b.multiplication(num1, num2));
				scanner.close();

			}

		}


