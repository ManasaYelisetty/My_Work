package day3;

import java.util.Scanner;

public class ReplacingDOccurenceWithH {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String replace=string.replace('d', 'h');
		System.out.println("After Replacing d with h: "+replace);
		scanner.close();
	}

}

	


