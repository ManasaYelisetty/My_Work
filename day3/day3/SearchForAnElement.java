package day3;

import java.util.Scanner;

public class SearchForAnElement {
	public int searchForElement(int[] array, int numToSearch) {
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == (numToSearch)) {
				num = array[i];

			}
		}
		if (num == (numToSearch)) {
			System.out.println(num + " is present");
		} else {
			System.out.println("No Match");
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no. of elements for an array:");
		int num1 = scanner.nextInt();
		int[] array = new int[num1];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < num1; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter the num you want to search: ");
		int num2 = scanner.nextInt();
		SearchForAnElement searchForAnElement = new SearchForAnElement();
		searchForAnElement.searchForElement(array, num2);
		scanner.close();

	}

}



