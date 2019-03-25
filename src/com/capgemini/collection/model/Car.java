package com.capgemini.collection.model;


import java.util.Objects;

public class Car implements Comparable<Car> {
	
	
	
	private String  make;
	private String  model;
	private int year;
	private double price;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}


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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + ", getMake()="
				+ getMake() + ", getModel()=" + getModel() + ", getYear()=" + getYear() + ", getPrice()=" + getPrice()
				+ "]";
	}
 
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(!(obj instanceof Car))
				return false;
		if(this==obj)
			return true;
		Car car=(Car) obj;
		if(this.make==car.make && this.model==car.model) 
				
			return true;
		return false;
			
	}
	@Override
	public  int hashCode()
	{
		return Objects.hash(make,model);
		
	}
	@Override
	public int compareTo(Car car)
	{
	return (this.make.compareTo(car.make)) ;	
	}
}
