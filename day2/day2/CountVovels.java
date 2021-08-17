package day2;

import java.util.Scanner;

public class CountVovels {

	public static void main(String[] args) {
		System.out.print("Input the string: ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.print("Number of  Vowels in the string: " + countVowels(string) + "\n");
		scanner.close();
	}

	public static int countVowels(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
					|| string.charAt(i) == 'u' || string.charAt(i) == 'A' || string.charAt(i) == 'E'
					|| string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U') {
				count++;
			}
		}
		return count;
	}
}
