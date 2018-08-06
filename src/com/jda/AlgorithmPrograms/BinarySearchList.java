package com.jda.AlgorithmPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.jda.utility.Utility;

public class BinarySearchList {
	public static void main(String args[]) throws Exception
	{
		Utility utility=new Utility();
		
		FileReader file=new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\AlgorithmPrograms\\Data.txt");
		BufferedReader br=new BufferedReader(file);
		System.out.println("Enter the string to be searched: ");
		String search=utility.inputString();
		ArrayList<String> list=new ArrayList<String>();
		String line=null;
		
		while((line=br.readLine())!=null)
		{
			String[] values=line.split(",");
			for(String str:values)
			{
				list.add(str);
			}
			}
		br.close();
		int length=list.size();
		String[] newArray=new String[length];
		newArray=list.toArray(newArray);
		Arrays.sort(newArray);
		
		int n=utility.binarySearchString(newArray, search);
		if(n==-1) 
			System.out.println("word not found");
			
		
		else
			System.out.println("word found");
		}

}
