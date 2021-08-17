package day2;

class SmallestNumber {
	public void printSmallest(int num1, int num2, int num3) {

		if (num1 <= num2 && num1 <= num3) {
			System.out.println(num1 + " is the smallest number");
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println(num2 + " is the smallest number");
		} else {
			System.out.println(num3 + " is the smallest number");

		}

	}
}
public class Smallest {
	public static void main(String[] args) {
		SmallestNumber smallestNumber = new SmallestNumber();
		smallestNumber.printSmallest(12, 3, 25);

	}

}
