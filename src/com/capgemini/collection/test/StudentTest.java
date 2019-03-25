package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Student;

public class StudentTest {
		
	private static Student sree;
	private static Student vidhya;
	private static Student shiva;
	private  static Student teja;
	
	@BeforeClass
	public static void setUp()
	{
		sree=new Student("sree",10);
		vidhya=new Student("vidhya",11);
		shiva =new  Student("shiva",12);
		teja= new Student("teja",13);
		
	}
	
	
	@Test
	public void toTestDetailsOfStudent()
	{
		ArrayList<Student> student=new ArrayList<>();
		student.add(sree);
		student.add(vidhya);
		student.add(shiva);
		student.add(teja);
		Iterator<Student> it=student.iterator();
		assertEquals(sree,it.next());
		assertEquals(vidhya,it.next());
		assertEquals(shiva,it.next());
		assertEquals(teja,it.next());
		
		
	}
	@Test
	public void toTestDetailsOfStudentInInsertion()
	{
		HashSet<Student> student=new HashSet<>();
		student.add(sree);
		student.add(vidhya);
		student.add(shiva);
		student.add(teja);
		assertEquals(4,student.size());
	}
	@Test
	public void testTheStudentDetailsAreNaturalOrder()
	{
		TreeSet<Student> student=new TreeSet<>();
		student.add(sree);
		student.add(vidhya);
		student.add(shiva);
		student.add(teja);
		Iterator<Student> it=student.iterator();
		assertEquals(sree,it.next());
		assertEquals(vidhya,it.next());
		assertEquals(shiva,it.next());
		assertEquals(teja,it.next());
		
	}
	
	@Test 
	public void toCheckMapStoreTheStudentDetails()
	{
		Map<String,String> map=new HashMap<String,String>();
		map.put("sree", "mango");
		map.put("vidhya", "banana");
		map.put("shiva","promogrnet");
		map.put("teja", "guva");
		Collection<String> keys=map.keySet();
		assertEquals(4,keys.size());
		
		
		Collection<String> values=map.keySet();
		assertEquals(4,values.size());
		assertEquals("mango",map.get("sree"));
		assertEquals("banana",map.get("vidhya"));
		assertEquals("promogrnet",map.get("shiva"));
		assertEquals("guva",map.get("teja"));
	}
}
