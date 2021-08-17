package day4_1;

public class FirstClass {
		int a = 100;
		public FirstClass() {
			System.out.println("in the constructor of class FirstClass: ");
			System.out.println("a = " + a);
			a = 333;
			System.out.println("a = " + a);
		}
		public void setFirstClass(int value) {
			a = value;
		}
		public int getFirstClass() {
			return a;
		}
	} // class FirstClass


