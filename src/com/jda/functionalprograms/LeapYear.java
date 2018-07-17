package com.jda.functionalprograms;
import com.jda.utility.Utility;
/**
 * Functional program for leap year
 * @author bridgelabz
 *
 */
public class LeapYear {
	public static void main(String args[])
	{
	Utility example=new Utility();
	System.out.println("Enter the year : ");
	int year=example.inputInt();
	Utility.leapYear(year);

	
	}

}
