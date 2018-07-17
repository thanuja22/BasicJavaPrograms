package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Gambler {
	public static void main(String args[])
	{
		Utility gamble=new Utility();
		System.out.println("Enter the stake : ");
		int stake=gamble.inputInt();
		System.out.println("Enter the goal : ");
		int goal=gamble.inputInt();
		System.out.println("number of times: ");
		int trials=gamble.inputInt();
	   Utility.gambler(stake,goal,trials);
		
	}

}
