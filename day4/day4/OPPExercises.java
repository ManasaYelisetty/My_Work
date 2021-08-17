package day4;

import day4_1.FirstClass;
import day4_1.SecondClass;

public class OPPExercises {
	public static void main(String[] args) {
		FirstClass objA = new FirstClass();
		SecondClass objB = new SecondClass();
		System.out.println("in main(): ");
		System.out.println("objA.a = " + objA.getFirstClass());
		System.out.println("objB.b = " + objB.getSecondClass());
		objA.setFirstClass(222);
		objB.setSecondClass(333.33);
		System.out.println("objA.a = " + objA.getFirstClass());
		System.out.println("objB.b = " + objB.getSecondClass());
	}
}
