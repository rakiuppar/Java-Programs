package com.collections.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Four");
		al.add("Four");
		al.add("Five");
		
		System.out.println(al);
		al.remove(3);
		al.add(0, "Numbers");
		System.out.println(al.get(4));
		System.out.println(al.subList(2, 5));		
		System.out.println("-----------------");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-----------------");
		
		for(String a : al)
			System.out.println(a);
		System.out.println("-----------------");
		
		for(int i=0; i<al.size(); i++)
			System.out.println(al.get(i));
		System.out.println("-----------------");
		
		al.forEach(all -> {
				System.out.println(all);		
				});
		System.out.println("-----------------");
		
		Iterator<String> it1 = al.iterator();
				it1.forEachRemaining(show -> {System.out.println(show);});

		System.out.println("Array Reverse -----------------");
		for(int j=al.size()-1; j>=0; j--)
			System.out.println(al.get(j));
	}
}
