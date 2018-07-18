package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Distance {
	public static void main(String args[])
	{
		Utility dist=new Utility();
		System.out.println("Enter the x co-ordinate : ");
		int x=dist.inputInt();
		System.out.println("Enter the y co-ordinate : ");
		int y=dist.inputInt();
		double distance=Utility.distance(x,y);
		System.out.println(distance);
		
	}

}
