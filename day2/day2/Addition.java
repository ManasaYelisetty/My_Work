package day2;

class AdditionOfNumbers {

	public static int add(int...num) {
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
	}
}

public class Addition {

	public static void main(String[] args) {
		System.out.println(AdditionOfNumbers.add(1,2));
		System.out.println(AdditionOfNumbers.add(1,2,3));
		System.out.println(AdditionOfNumbers.add(1,2,3,4,5));
		System.out.println(AdditionOfNumbers.add(1,2,3,4,5,6));
	}
}
