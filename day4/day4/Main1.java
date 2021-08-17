package day4;

import java.util.Scanner;

import day4_1.Circle;
import day4_1.Rectangle;
import day4_1.Square;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the shape name: ");
		System.out.println("1.Circle\n2.Rectangle\n3.Square");
		String option = scanner.next();
		if (option.equals("Circle")) {
			System.out.println("Enter the radius: ");
			int radius = scanner.nextInt();
			Circle c = new Circle("Cir", radius);
			System.out.println(c.calculatedArea());
		} else if (option.equals("Rectangle")) {
			System.out.println("Enter the length: ");
			int length = scanner.nextInt();
			System.out.println("Enter the breadth: ");
			int breadth = scanner.nextInt();
			Rectangle r = new Rectangle("Rect", length, breadth);
			System.out.println(r.calculatedArea());

		} else if (option.equals("Square")) {
			System.out.println("Enter the side: ");
			int side = scanner.nextInt();
			Square s = new Square("Squ", side);
			System.out.println(s.calculatedArea());
		} else {
			System.out.println("Not matched");
		}

		scanner.close();
	}

}
