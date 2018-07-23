package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class Binary {
	public static void main(String arg[])
	{
		Utility u=new Utility();
		int n=u.inputInt();
		int x=u.toBinary(n);
		System.out.println(x);
		System.out.println(u.swapNibbles(x));
	}

}
