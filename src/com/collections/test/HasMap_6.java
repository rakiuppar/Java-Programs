package com.collections.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class HasMap_6 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		hm.put(5, "Five");
		System.out.println(hm);
		
		System.out.println(hm.get(4));
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm);
		System.out.println(hm.containsValue("One"));
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		
		System.out.println("------------------");
		System.out.println("1) For loop ----");
		for(int i=0; i<hm.size(); i++)
			System.out.println(hm.get(i));
		
		System.out.println("------------------");
		for(Entry<Integer, String> e : hm.entrySet())
			System.out.println(e);
		
		System.out.println("------------------");
		hm.remove(2);
		for(Entry<Integer, String> e1 : hm.entrySet())
			System.out.println(e1);
		
	}

}
