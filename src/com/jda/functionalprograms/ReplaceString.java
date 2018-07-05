package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class ReplaceString {

	public static void main(String args[]) {
		Utility utility = new Utility();
		String template = "Hello <<Username>>, How are you?";
		System.out.println("Enter your name: ");
		String Inputname = utility.inputString();
		String output = utility.replaceString(template, Inputname);
		System.out.println(output);
	
	}
}
