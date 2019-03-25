package com.capgemini.collection.model;

import java.util.Objects;

public class School {
	
	
	private String name;
	private String city;
	private String school_district;
	private int greatSchoolRanking;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(String name, String city, String school_district, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.school_district = school_district;
		this.greatSchoolRanking = greatSchoolRanking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSchool_district() {
		return school_district;
	}
	public void setSchool_district(String school_district) {
		this.school_district = school_district;
	}
	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}
	public void setGreatSchoolRanking(int  greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(!(obj instanceof School))
				return false;
		if(this==obj)
			return true;
		School school=(School) obj;
		if(this.name==school.name && this.city==school.city
				&& this.school_district==school.school_district) 
				
			return true;
		return false;
			
	}
	@Override
	public  int hashCode()
	{
		return Objects.hash(name,city,greatSchoolRanking);
		
	}

}
