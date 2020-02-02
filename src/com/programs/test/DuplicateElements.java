package com.programs.test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) 
	{
		String a[] = {"Reverse","String","Java","String","C","Java","Java"};
		for(int i=0; i<a.length; i++)
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		System.out.println("-------------------");
		Integer s[] = {99,2,3,45,67,55,55,3,2,88,99,88,987,23};
		for (int k=0; k<s.length; k++)
			for(int l=k+1; l<s.length; l++)
			{
				if(s[k]==s[l])
				{
					System.out.println(s[k]);
				}
				
			}
		
		System.out.println("-------------------");
		Set<String> st = new HashSet<String>();
		for(String val : a)
			if(st.add(val) == false)
				System.out.println(val);
		
		System.out.println("-------------------");
		Set<Integer> st1 = new HashSet<Integer>();
		for(Integer val1 : s)
			if(st1.add(val1) == false)
				System.out.println(val1);
			
		
	}

}
