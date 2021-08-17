package day3;

import java.util.Scanner;

class UserMainCode1 {
	public static String stringModify(char ch, String string) {
		String mod = " ";
		char[] ch1 = string.toCharArray();
		for (int i = ch1.length - 1; i >= 0; i--) {
			if (i == 0) {
				mod += ch1[0];
			} else {
				mod += ch1[i] + Character.toString(ch);

			}

		}
		return mod;
	}
}

public class ReverseMain {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		System.out.println("The modified string is: " + UserMainCode1.stringModify(ch, string));
		sc.close();

	}

}
