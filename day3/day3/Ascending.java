package day3;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		int num, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of elements for an  array:");
		num = scanner.nextInt();
		int array[] = new int[num];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < num; i++) {
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int i = 0; i < num - 1; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.print(array[num - 1]);
		scanner.close();
	}
}
