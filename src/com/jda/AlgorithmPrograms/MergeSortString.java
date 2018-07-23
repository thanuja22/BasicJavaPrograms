package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class MergeSortString {
public static void main(String args[]) 
{
Utility sorting=new Utility();
System.out.println("length of the array : ");
int length=sorting.inputInt();
System.out.println("array entries : ");
String[] array=sorting.arrayStringInput(length);
System.out.println("print the array : ");
sorting.printStringArray(array);
String[] sortedArray=sorting.mergeSort(array);
System.out.println("sorted array : ");
sorting.printStringArray(sortedArray);



	
}
}
