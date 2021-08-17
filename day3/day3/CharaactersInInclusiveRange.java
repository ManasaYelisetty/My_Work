package day3;

import java.util.Scanner;

public class CharaactersInInclusiveRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String string = scanner.nextLine();
		System.out.println("Enter the begin index: ");
		int beginIndex = scanner.nextInt();
		System.out.println("Enter the End Index: ");
		int endIndex = scanner.nextInt();
		System.out.println(string.substring(beginIndex, endIndex));
		scanner.close();

	}

}
