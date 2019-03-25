package com.capgemini.collection.client;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		
		ArrayList<String> name=new ArrayList<>();
		name.add("Alex");
		name.add("Anna");
		name.add("adem");
		name.add("Bob");
		name.add("Grant");
		
		Iterator<String>it=name.iterator();
		while(it.hasNext())
		{
			String name1=it.next();
			System.out.println(name1);
		}
		
	}

}
