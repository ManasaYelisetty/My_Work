package com.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Car;
import com.service.CarServices;

public class CarMain {

	public static void main(String[] args) throws Exception {
		String make, model;
		int year;
		float sales_price;
		List<Car> carlist;
		List<Car> list = new ArrayList<Car>();
		System.out.println("Welcome to mullet joes gently used autos! ");
		Scanner sc = new Scanner(System.in);
		CarServices carServices = new CarServices();
		Car car = new Car();
		while (true) {
			System.out.println("1.ADD 2.List 3.Delete 4.Update 5.Quit");
			System.out.println("Enter your choice");
			String choice = sc.next();
			if (choice.equalsIgnoreCase("quit")) {
				System.out.println("Good BYE!!");
				break;
			} else {
				switch (choice) {
				case "add":
					System.out.println("Enter Make.");
					make = sc.next();
					System.out.println("Enter Model.");
					model = sc.next();
					System.out.println("Enter year.");
					year = sc.nextInt();
					System.out.println("enter sales_price");
					sales_price = sc.nextFloat();
					car.setMake(make);
					car.setModel(model);
					car.setYear(year);
					car.setSales_price(sales_price);
					try {
						carServices.addCar(car);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case "list":
					System.out.println("Displaying...");
					carServices.viewCars();

					break;
				case "delete":
					System.out.println("Enter Make to delete");
					make = sc.next();
					System.out.println("Enter Model to delete");
					model = sc.next();
					String status;
					try {
						status = carServices.deleteCar(make, model);
						System.out.println(status);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;

				case "update":
					System.out.println("enter sales_price to be updated");
					sales_price = sc.nextFloat();
					System.out.println("Enter Make.");
					make = sc.next();
					System.out.println("Enter Model");
					model = sc.next();
					String status1;
					try {
						status1 = carServices.updateCar(make, model, sales_price);
						System.out.println(status1);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				default:
					System.out.println("Invalid option");
				}
			}
		}
	}

}
