package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class WindChill {
public static void main(String args[])
{
	Utility wind=new Utility();
	System.out.println("Value of velocity : ");
	int velocity=wind.inputInt();
	System.out.println("Value of time : ");
	int time=wind.inputInt();
	Utility.windChill(velocity, time);
	
	
	
}
}
