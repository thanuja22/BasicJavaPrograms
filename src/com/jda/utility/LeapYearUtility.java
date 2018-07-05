package com.jda.utility;

import com.jda.functionalprograms.LeapYear;

public class LeapYearUtility 
{
	public static void main(String args[])
{
LeapYear example=new LeapYear();
System.out.println("Enter the year : ");
int year=example.inputInt();

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

