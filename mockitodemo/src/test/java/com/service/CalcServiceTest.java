package com.service;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito;
public class CalcServiceTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("Test case execution");
		AddService addService;
		CalcService calcService;
		addService =Mockito.mock(AddService.class);
		calcService=new CalcService(addService);
		
		int num1=10;
		int num2=20;
		int expected=30;
		when(addService.add(num1, num2)).thenReturn(expected);
		assertEquals(30,calcService.calc(10, 20
				));
	}

}
