package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class WindChill {
public static void main(String args[])
{
	Utility wind=new Utility();
	System.out.println("Value of velocity : ");
	int velocity=wind.inputInt();
	System.out.println("Value of temperature : ");
	int tem=wind.inputInt();
	double value=Utility.windchill(velocity, tem);
	System.out.println("value of w : "+value);
	
	
	
	
	
}
}
