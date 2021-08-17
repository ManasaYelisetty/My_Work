package day1;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		System.out.println("Enter the First number: ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		System.out.println("Enter the Second number : ");
		int num2 = input.nextInt();
		System.out.println("Numbers before Swapping:" + num1 + "and" + num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after Swapping:" + num1 + "and" + num2);
		input.close();
	}

}


