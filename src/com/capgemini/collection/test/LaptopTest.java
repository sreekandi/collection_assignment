package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Laptop;

public class LaptopTest {
	
	private static Laptop asusLaptop;
	private static Laptop dellLaptop;
	private static Laptop hpLaptop;
	
	
	@BeforeClass
	public static void setUp()
	{
		asusLaptop =new Laptop("ASUS","NotePad","Windows 10","Intel");
		dellLaptop =new Laptop("DELL","NotePad","Windows 8","Intel I5");
		hpLaptop =new Laptop("HP","NotePad","Windows 10","Intel Core I3");
	}
	
	
	
	
	@Test
	public void testToCheckLaptopdetails()
	
	{
		ArrayList<Laptop> laptops=new ArrayList<>();
		laptops.add(asusLaptop);
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		
		Iterator<Laptop> it=laptops.iterator();
		
		assertEquals(asusLaptop,it.next());
		assertEquals(dellLaptop,it.next());
		assertEquals(hpLaptop,it.next());
		
	}
	@Test
	public void testToCheckLaptopsSizeAndDuplicates()
	{
		HashSet<Laptop> laptop=new HashSet<>();
		laptop.add(asusLaptop);
		laptop.add(dellLaptop);
		laptop.add(hpLaptop);
		Iterator<Laptop> it=laptop.iterator();
		
		
		
		assertEquals(3,laptop.size());
		
		
	}
	
	
	

	{
		
	}

	

}
