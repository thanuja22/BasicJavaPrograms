package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class ToBinary {
	public static void main(String args[])
	{
		System.out.println("please enter the number u want to convert into binary");
		Utility utility=new Utility();
		int input=utility.inputInt();
		utility.toBinary(input);
	}

}
