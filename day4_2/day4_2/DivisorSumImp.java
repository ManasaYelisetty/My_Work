package day4_2;

import day4_1.AdvancedArithmetic.AdvancedAirthmetic;

public class DivisorSumImp implements AdvancedAirthmetic {

	@Override
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println("Divisors are :" + i);
				sum += i;
			}
		}
		return sum;
	}
}
