package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.CellPhone;



public class CellPhoneTest {
	
		private static CellPhone samsung;
		private static CellPhone mi;
		private static CellPhone vivo;
		
		
	@BeforeClass
	public static void setUp()
	{
		samsung=new CellPhone("samsung","M20","dual_sim","Android",12000.0);
		mi=new CellPhone("ReadMi","Note5 pro","Battery4000MAH","Android",15000.0);
		vivo=new CellPhone("ViVo","v6","dual_camara","Android",15000.0);
	}
		
	
	@Test
	public void testCellPhoneIsertion()
	{
		ArrayList<CellPhone> phone=new ArrayList<>();
		phone.add(samsung);
		phone.add(mi);
		phone.add(vivo);
		
		Iterator<CellPhone> it=phone.iterator();
		assertEquals(samsung,it.next());
		assertEquals(mi,it.next());
		assertEquals(vivo,it.next());
	
	}
	@Test
	public void testToCheckLaptopsSizeAndDuplicates()
	{
		HashSet<CellPhone> phone=new HashSet<>();
		phone.add(samsung);
		phone.add(mi);
		phone.add(vivo);
		
		assertEquals(3,phone.size());
		
	}

}
