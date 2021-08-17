package day4_1;

public class SecondClass {
		double b = 123.45;
		public SecondClass() {
			System.out.println("-----in the constructor of class B: ");
			System.out.println("b = " + b);
			b = 3.14159;
			System.out.println("b = " + b);
		}
		public void setSecondClass(double value) {
			b = value;
		}
		public double getSecondClass() {
			return b;
		}
	} // class SecondClass

