package day3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string = scanner.nextLine();
		String reverseString = "";
		int lengthOfString = string.length();
		for (int i = lengthOfString - 1; i >= 0; i--) {
			reverseString = reverseString + string.charAt(i);
		}
		if (reverseString.equals(string)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not palindrome");
		}
		scanner.close();
	}

}
