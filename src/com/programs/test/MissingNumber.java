package com.programs.test;

public class MissingNumber 
{
	public static void main(String[] args) 
	{
		int nums[] = {1,2,3,4,5,7,8};
		int total1 = 0;
		int total2 = 0;
		for(int i=0; i<nums.length; i++)
		{
			total1 = total1 + nums[i];
		}
		System.out.println(total1);
		
		
		for(int j=1; j<9; j++)
		{
			total2 = total2 + j;
		}
		System.out.println(total2);
		
		System.out.println(total2-total1);
	}

}
