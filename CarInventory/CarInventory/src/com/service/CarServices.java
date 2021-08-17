package com.service;

import java.sql.SQLException;
import java.util.List;

import com.crudoperations.CarCrudOperations;
import com.pojo.Car;

public class CarServices {
 CarCrudOperations cco=new CarCrudOperations();
  public List<Car> viewCars() throws Exception {
	  return cco.view();
  }
  public Car addCar(Car car) throws Exception {
	  return cco.insertCar(car);
  }
  public String updateCar(String make,String model,float price) throws Exception{
	  return cco.updateCar(make,model, price);
  }
public String deleteCar(String make,String model) throws Exception {
	return cco.deleteCar(make,model);
	
}
  
}
