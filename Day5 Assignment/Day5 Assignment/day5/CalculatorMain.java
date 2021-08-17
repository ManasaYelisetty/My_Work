package day5;

import java.util.Scanner;

import day5_1.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

				while (sc.hasNextInt()) {
					int n = sc.nextInt();
					int p = sc.nextInt();
					Calculator calculator = new Calculator();
					try {
						System.out.println((calculator.power(n, p)));
					} catch (Exception e) {
						System.out.println(e);
					}
				}
				sc.close();

			}
		}
	
