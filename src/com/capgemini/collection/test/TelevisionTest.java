package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;


import com.capgemini.collection.model.Television;

public class TelevisionTest {
	
	private static Television lg;
	private static Television sony;
	private static Television samsung;
	
	
	@BeforeClass
	public static void setUp()
	{
		lg=new Television("LG","LED","yes",25000.0);
		sony=new Television("SONY","LCD","no",15000.0);
		samsung=new Television("SAMSUNG","plasma","yes",30000.0);
		
	}

	
	
	
	@Test
	public void testTelevisionToinserted()
	{
		ArrayList<Television> television=new ArrayList<>();
		television.add(lg);
		television.add(sony);
		television.add(samsung);
		
		Iterator<Television> it=television.iterator();
		assertEquals(lg,it.next());
		assertEquals(sony,it.next());
		assertEquals(samsung,it.next());
	
	}
	@Test
	public void testToCheckLaptopsSizeAndDuplicates()
	{
		HashSet<Television> television=new HashSet<>();
		television.add(lg);
		television.add(sony);
		television.add(samsung);
		
		
		assertEquals(3,television.size());
		
	}
}
