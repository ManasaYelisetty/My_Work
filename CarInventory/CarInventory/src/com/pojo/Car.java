package com.pojo;

public class Car {
	private String make;
	private String model;
	private int year;
	private float sales_price;

		public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getSales_price() {
		return sales_price;
	}

	public void setSales_price(float sales_price) {
		this.sales_price = sales_price;
	}

		@Override
	public String toString() {
		return "Car[make=" + make + ", model=" + model + ", year=" + year + ", sales_price=" + sales_price + "]";

	}

}
