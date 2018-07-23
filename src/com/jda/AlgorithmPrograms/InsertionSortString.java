package com.jda.AlgorithmPrograms;



import com.jda.utility.Utility;

public class InsertionSortString {
	

	public static void main(String[] args) 
	{	
		Utility u=new Utility();
		System.out.println("Enter no. of words to be printed: ");
		int n=u.inputInt();
		 
		//create string array
		
		System.out.println();	
		System.out.println("Enter the words to be printed: ");
		String b[]=u.input1DStringArray(n);
		
		//sort string array using Arrays.sort method
		System.out.println("Sorted order is: ");
		String s[]=u.insertionSortString(b);
		u.print1DStringArray(s);
		
		
	}
}

	
