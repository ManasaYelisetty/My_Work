package day4;

import day4_1.A;

public class OopsExcercise {

	public static void main(String[] args) {

		A objA = new A();

		System.out.println("in main(): ");

		// System.out.println("objA.a = " + objA.a);

		 //objA.a = 222;
		objA.setA(100);
		System.out.println("objA.a = " + objA.getA());

	}

}
