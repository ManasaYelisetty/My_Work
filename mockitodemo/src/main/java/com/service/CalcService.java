package com.service;

public class CalcService {

	private AddService addService;

	public CalcService(AddService addService) {
		super();
		this.addService = addService;
	}
	
	public int calc(int abc, int efg)
	{
		System.out.println("CalcService  cal(int abc,int efg)");
		return addService.add(abc, efg);
	}
}
