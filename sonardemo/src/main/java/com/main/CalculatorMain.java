package com.main;

import com.service.Calculator;
import com.service.CalculatorServiceImpl;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator=new CalculatorServiceImpl();
		System.out.println(calculator.add(3, 7));
		int result=calculator.sub(8, 4);
		System.out.println(result);

	}

}
