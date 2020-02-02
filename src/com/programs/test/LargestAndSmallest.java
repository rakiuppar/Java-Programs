package com.programs.test;

public class LargestAndSmallest 
{

	public static void main(String[] args) 
	{
		int a[] = {2,4,6,8,1,2,89,898,3,4,21,3};
		int low = a[0];
		int high = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(high < a[i])
				high = a[i];
			else if(low > a[i])
				low = a[i];				
		}
		
		System.out.println("Highest: "+high);
		System.out.println("Lowest: "+low);

	}

}
