package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class Binary {
	public static void main(String arg[])
	{
		System.out.println("please enter the number u want to convert into binary");
		Utility utility=new Utility();
		int input=utility.inputInt();
		utility.swapNibbles(input);
	}

}
