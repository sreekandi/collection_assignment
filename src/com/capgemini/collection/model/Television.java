package com.capgemini.collection.model;

import java.util.Objects;

public class Television {
	
	
	private String company;
	private String type ;
	private String  enabled_3D;
	private double price;
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Television(String company, String type, String enabled_3d, double price) {
		super();
		this.company = company;
		this.type = type;
		enabled_3D = enabled_3d;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEnabled_3D() {
		return enabled_3D;
	}
	public void setEnabled_3D(String enabled_3d) {
		enabled_3D = enabled_3d;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(!(obj instanceof Television))
				return false;
		if(this==obj)
			return true;
		Television television=(Television) obj;
		if(this.company==television.company && this.type==television.type 
		&& this.price==television.price)
			return true;
		return false;
			
	}
	@Override
	public  int hashCode()
	{
		return Objects.hash(company,type,enabled_3D);
		
	}
}
