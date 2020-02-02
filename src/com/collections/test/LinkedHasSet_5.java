package com.collections.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSet_5 
{
	public static void main(String args[])
	{
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		int num=1;
		while(num<11)
		{
			lhs.add(num);
			num++;
		}
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		lhs.remove(9);
		
		System.out.println("1) Normal print ----");
		System.out.println(lhs);
		
		System.out.println("2) Advance For loop ----");
		for(int a : lhs)
			System.out.println(a);
		
		System.out.println("3) Iterator ----");
		Iterator<Integer> it = lhs.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("4) Lamda / For each loop ----");
		lhs.forEach(eles -> {System.out.println(eles);});
	}
}
