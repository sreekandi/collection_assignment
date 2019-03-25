package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;


import com.capgemini.collection.model.School;

public class SchoolTest {
	
	private static School zph;
	private static School sriChitanya;
	private static School bhashyam;
	
	
	@BeforeClass
	public static void setUp()
	{
		zph=new School("zph","zarugumalli","Prakasam",1);
		sriChitanya=new School("sriChaitanya","Tangutur","Prakasam",1);
		bhashyam=new School("bhashyam","Ongole","Prakasam",2);
	}
	
	

	@Test
	public void toChekSchoolDetails()
	{
		ArrayList<School> school=new ArrayList<>();
		school.add(zph);
		school.add(sriChitanya);
		school.add(bhashyam);
		Iterator<School> it=school.iterator();
		assertEquals(zph,it.next());
		assertEquals(sriChitanya,it.next());
		assertEquals(bhashyam,it.next());
		
	}
	@Test
	public void toChekSchoolDetailsinOrder()
	{
		HashSet<School> school=new HashSet<>();
		school.add(zph);
		school.add(sriChitanya);
		school.add(bhashyam);
		assertEquals(3,school.size());
	}

}
