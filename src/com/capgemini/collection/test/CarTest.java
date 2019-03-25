package com.capgemini.collection.test;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Car;



public class CarTest {
	
	private static Car suziki;
	private static Car maruthi;
	private static Car hundai;
	private static Car audi;
	
	@BeforeClass
	public static  void setUp()
	{
		suziki=new Car("chaina","suziki 120",1999,450000.0);
		maruthi=new Car("india","maruthi 800",2000,500000.0);
		hundai=new Car("koria","hundai",2005,500000.0);
		audi=new Car("us","audi",1997,700000.0);
	}
	
	

	@Test
	public void tocheckcarDetails()
	{
		ArrayList<Car> car=new ArrayList<>();
		car.add(suziki);
		car.add(maruthi);
		car.add(hundai);
		car.add(audi);
		Iterator<Car> it=car.iterator();
		assertEquals(suziki,it.next());
		assertEquals(maruthi,it.next());
		assertEquals(hundai,it.next());
		assertEquals(audi,it.next());
		
	}
	@Test
	public void tocheckCarListSizeAndDuplicates()
	{
		HashSet<Car> car=new HashSet<>();
		car.add(suziki);
		car.add(maruthi);
		car.add(hundai);
		car.add(audi);
	
		assertEquals(4,car.size());
	}
	@Test
	public void toCompareTheCars()
	{
		TreeSet<Car> car=new TreeSet<>();
		car.add(suziki);
		car.add(maruthi);
		car.add(hundai);
		car.add(audi);
		Iterator<Car> it=car.iterator();
		assertEquals(suziki,it.next());
		assertEquals(maruthi,it.next());
		assertEquals(hundai,it.next());
		assertEquals(audi,it.next());
		
	}

}
