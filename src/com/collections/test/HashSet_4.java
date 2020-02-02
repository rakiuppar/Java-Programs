package com.collections.test;

import java.util.HashSet;
import java.util.Iterator;


public class HashSet_4 
{
	public static void main(String args[])
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=1; i<=10; i++)
			hs.add(i);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		for(int j=1; j<=5; j++)
			hs1.add(j);
		
		hs.add(5);
		System.out.println(hs);
		System.out.println(hs1);
		System.out.println(hs.isEmpty());
		System.out.println(hs.getClass());
		System.out.println(hs.size());
		System.out.println(hs.contains(2));
//		System.out.println(hs.retainAll(hs1));
//		System.out.println(hs);
//		System.out.println(hs1);
		hs.add(5);
		
		System.out.println("1) Direct print -----");
		System.out.println(hs);

		System.out.println("2) Advance For loop -----");
		for(Integer in: hs)
			System.out.println(in);
		
		System.out.println("3) Iterator method -----");
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("4) For Each or Lamda Exprn -----");
		hs.forEach(eles ->{ System.out.println(eles);});
		

		
		
	}
}
