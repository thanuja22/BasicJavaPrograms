package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Recursion {
	public static void main(String args[])
	{
		Utility permutation=new Utility();
		System.out.println("Enter the string : ");
		String str=permutation.inputString();
		int n=str.length();
		permutation.permute(str, 0, n-1);
	}

}
