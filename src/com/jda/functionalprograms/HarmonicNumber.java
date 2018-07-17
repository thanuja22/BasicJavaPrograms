package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class HarmonicNumber {
	public static void main(String args[])
	{
		Utility sequence=new Utility();
		System.out.println("Enter the index : ");
		int index=sequence.inputInt();
		Utility.harmonic(index);
		
	}

}
