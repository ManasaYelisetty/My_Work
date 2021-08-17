package day3;

import java.util.Scanner;

class UserMainCode {
	public static String getString(String old) {
		if (old.charAt(0) == 'k' || old.charAt(0) == 'K') {
			String mod = old.charAt(0) + old.substring(2);
			return mod;
		} else if (old.charAt(1) == 'b' || old.charAt(1) == 'B') {
			String mod = old.charAt(1) + old.substring(2);
			return mod;
		} else {
			String mod = old.substring(2);
			return mod;
		}
	}
}

public class ModifiedString {
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(UserMainCode.getString(string));
		scanner.close();
	}
}
