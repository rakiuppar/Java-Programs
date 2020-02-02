package com.collections.test;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_2 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("One");
		ll.add("Two");
		ll.add("Three");
		ll.add("Four");
		ll.add("Five");
		
		System.out.println("-----------");
		System.out.println(ll);
		System.out.println("-----------");
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(3));
		System.out.println("-----------");
		
		ll.add(0, "Numbers");
		System.out.println(ll);
		System.out.println("-----------");
		System.out.println("1) For ----");
		for(int i=0; i<ll.size(); i++)
			System.out.println(ll.get(i));
			
		System.out.println("2) Advance For ------");
		for(String a : ll)
			System.out.println(a);
			
		System.out.println("3) Iterator -----");
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
			System.out.println(it.next());
			
		System.out.println("4) For Each -----");
		ll.forEach(l -> { System.out.println(l);});

	}

}
