package com.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.DBConnection;
import com.pojo.Car;

public class CarCrudOperations{
	Connection con;
	List<Car> list=new ArrayList<Car>();
	Car car=new Car();
	public List<Car> view() throws Exception {
		ResultSet rs=null;
		Statement stmt=null;
		con=DBConnection.getConnection();
		try {
			stmt=con.createStatement();
			String sql="select make,model,year,sales_price from car";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				String make=rs.getString(1);
				String model=rs.getString(2);
				int year=rs.getInt(3);
				float sales_Price=rs.getFloat(4);
				car.setMake(make);
				car.setModel(model);
				car.setYear(year);
				car.setSales_price(sales_Price);
				list.add(car);
				System.out.println(car);
				
			}
		
			System.out.println("No of cars:"+count());
			System.out.println("Total Price"+average());
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(stmt!=null)
					stmt.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public void closePreparedStmt(PreparedStatement stmt) {
		try {
			if(stmt!=null) {
				stmt.close();
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public Car insertCar(Car car) throws Exception{
		con=DBConnection.getConnection();
		String str1 = "select count(year) from car";// To make count of number of entries
		PreparedStatement stmt1 = con.prepareStatement(str1);
		ResultSet rs = stmt1.executeQuery();
			while (rs.next()) {
				int i = rs.getInt(1);
				if (i < 3) {
		
		String sql="insert into car values(?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(sql);
		
	
		try
		{
			stmt.setString(1, car.getMake());
			stmt.setString(2, car.getModel());
			stmt.setInt(3, car.getYear());
			stmt.setFloat(4, car.getSales_price());
			stmt.executeUpdate();
		}
		catch(SQLException se) {
			se.getMessage();
		}
		finally {
			closePreparedStmt(stmt);
		}}
		else {
			System.out.println("Sorry!! Limit exceeded");
		}
			}
	
		return car;
	}
	public String deleteCar(String make,String model) throws Exception{
		con=DBConnection.getConnection();
		String sql="delete from car where make=?and model=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		try
		{
			stmt.setString(1, make);
			stmt.setString(2, model);
			stmt.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		finally {
			closePreparedStmt(stmt);
		}
		return "deleted Successfully";
	}
	//Method to update details on the car table 
	public String updateCar(String make,String model,float price)throws Exception{
		con=DBConnection.getConnection();
		String sql="update car set sales_price=?"+"where make=?and model=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		try
		{
			stmt.setFloat(1, price);
			stmt.setString(2, make);
			stmt.setString(3, model);
			stmt.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		finally {
			closePreparedStmt(stmt);
		}
		return "Updated Successfully";
	}
	public float average() throws Exception{
		con=DBConnection.getConnection();
		ResultSet rs=null;
		float sum=0;
		String sql="select sum(sales_price) from car";
		PreparedStatement stmt=con.prepareStatement(sql);
		try
		{
			rs=stmt.executeQuery();
			while(rs.next()) {
				float c=rs.getFloat(1);
				sum=sum+c;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			closePreparedStmt(stmt);
		}
		return sum;
	}

public int count() throws Exception {
    con = DBConnection.getConnection();
    ResultSet rs=null;int count=0;
    String sql = "select count(*) from car";
    PreparedStatement stmt = con.prepareStatement(sql);
    try {
    rs=stmt.executeQuery();
    while(rs.next()) {
    	 count=rs.getInt(1);
    }
    }catch(SQLException e) {
        e.printStackTrace();
    }finally {
        closePreparedStmt(stmt);
    }
    return count;
    
}
}