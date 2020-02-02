package com.collections.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_3 
{
	public static void main(String args[])
	{
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1; i<=10; i++)
			q.add(i);
		System.out.println(q);
		
		System.out.println("------");
		q.add(11);
		System.out.println(q.toString());
		
		q.remove(10);
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.peek());
		
		System.out.println("1) Advance For loop ------");
		for(Integer ele : q)
			System.out.println(ele);
		
		System.out.println("2) Iterator ------");
		Iterator<Integer> it = q.iterator();
		while(it.hasNext())
			System.out.println(it.next());

		System.out.println("2) For Each Lamda exprn ------");
		q.forEach(eles -> {System.out.println(eles);});
	}
}
