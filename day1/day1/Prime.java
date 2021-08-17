package day1;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int temp;
		boolean status = true;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = in.nextInt();
		for (int i = 2; i <= n / 2; i++) {
			temp = n % i;
			if (temp == 0) {
				status = false;
				break;
			}
		}
		if (status) {
			System.out.println(n + " is Prime");
		} else {
			System.out.println(n + " is not Prime");
		}
		in.close();
	}

}
