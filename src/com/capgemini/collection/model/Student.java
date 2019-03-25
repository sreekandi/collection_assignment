package com.capgemini.collection.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	
	private String name;
	private int rollNumber;

	
	
	public Student() {
		super();
	
	}
	
	
	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", getName()=" + getName()
				+ ", getRollNumber()=" + getRollNumber() + ", hashCode()=" + hashCode() + "]";
	}


	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(!(obj instanceof Student))
				return false;
		if(this==obj)
			return true;
		Student student=(Student) obj;
		if(this.name==student.name && this.rollNumber==student.rollNumber) 
				
			return true;
		return false;
			
	}
	@Override
	public  int hashCode()
	{
		return Objects.hash(rollNumber);
		
	}
	@Override
	public int compareTo(Student student)
	{
	return (this.rollNumber-student.rollNumber);	
	}
	
	

}
