package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class MergeSortString {
public static void main(String args[]) 
{
	Utility utility = new Utility();
	System.out.println("please enter the no.of strings u want to enter");
int input = utility.inputInt();
String[] stringarray = new String[input];
System.out.println("please enter the strings");
for (int i = 0; i < input; i++) {
	stringarray[i] = utility.inputString();

}
		utility.mergeSort(stringarray,0,input-1);
		
	utility.printArray(stringarray);
	
}
}
