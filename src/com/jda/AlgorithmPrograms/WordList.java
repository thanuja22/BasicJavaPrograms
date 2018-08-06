package com.jda.AlgorithmPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.jda.utility.Utility;

public class WordList {
	public static void main(String args[]) throws IOException
	{
		Utility u=new Utility();
		FileReader file=new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\AlgorithmPrograms\\text.txt");
	BufferedReader fileInput=new BufferedReader(file);
String line=fileInput.readLine();
String[] words=line.split(" ");
System.out.println(words);
	 
	
	}

}
