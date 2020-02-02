package com.collections.test;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HasTable_7 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
		ht.put(1, "One");
		ht.put(2, "Two");
		ht.put(3, "Three");
		ht.put(4, "Four");
		ht.put(5, "Five");
		System.out.println(ht.values());
		System.out.println(ht.get(3));
		System.out.println(ht.remove(4));
		System.out.println(ht.replace(1, "trtr"));
		System.out.println(ht.values());
		System.out.println(ht.replace(5, "Five", "FIve555"));
		System.out.println(ht.values());
		
		System.out.println("----------");
		for(Entry e : ht.entrySet())
		{
			System.out.println(e);
		}
		
		System.out.println("----------");
		Enumeration e = ht.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		
	
	
	}

}
