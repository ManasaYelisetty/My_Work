package day3;

import java.util.Scanner;

public class Lowercase {

	public static void main(String[] args) {

		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String afterConversion = string.toLowerCase();
		System.out.println("The string after converting to lower case: " + afterConversion);
		scanner.close();

	}
}
