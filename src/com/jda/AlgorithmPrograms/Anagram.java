package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class Anagram {
	public static void main(String args[])
	{
		Utility string=new Utility();
		System.out.println("Enter the first string : ");
		String string1=string.inputString();
		System.out.println("Enter the second string : ");
		String string2=string.inputString();
		Utility.anagramDetection(string1, string2);
		
		
	}

}
