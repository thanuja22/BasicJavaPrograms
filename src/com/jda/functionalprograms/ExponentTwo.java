package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class ExponentTwo {
	public static void main(String args[])
	{
	
   Utility index=new Utility();
	System.out.println("Enter the index : ");
	int N=index.inputIndex();
   double year=Math.pow(2, N);
   System.out.println("year is :"+year);
   if((year%400==0) ||((year%4==0)&&(year%100!=0)))
	{
		System.out.println("leap year");
	}
	else
	{
		System.out.println("not leap year");
	}
   
	

	 
}
}