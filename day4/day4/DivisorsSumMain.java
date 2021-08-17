package day4;

import java.util.Scanner;

import day4_1.AdvancedArithmetic.AdvancedAirthmetic;
import day4_2.DivisorSumImp;

public class DivisorsSumMain {

	public static void main(String[] args) {
		AdvancedAirthmetic advancedAirthmetic = new DivisorSumImp();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		System.out.println("\nDivisors sum is : " + advancedAirthmetic.divisor_sum(num));
		scanner.close();

	}

}
