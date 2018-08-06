package com.jda.ObjectOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.Utility;

public class Regex {
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser=new JSONParser ();
		Object obj=parser.parse(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Input2.JSON"));
		 JSONObject jsonObject = (JSONObject) obj;
		 String str=(String)jsonObject.get("DATA");
		 
	       
	        Utility utility=new Utility();
	        /*
	         *  // Create a pattern to be searched
        Pattern pattern = Pattern.compile("geeks");
 
        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher("geeksforgeeks.org");
 
        // Print starting and ending indexes of the pattern
        // in text
        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                               " to " + (m.end()-1));
	         */
	        /*
	         * 
	         */
	        
	        System.out.println("Enter your name");
	        Pattern pattern = Pattern.compile("<<[a-zA-Z]{4}>>");//string length up-to 4 and match characters in list [a-zA-Z]
	        
	        Matcher mtch = pattern.matcher(str);
	        String name=utility.inputString();
	       String rslt= mtch.replaceAll(name);
	       
	       Pattern pattern1 = Pattern.compile("<<[a-z A-Z]{9}>>");//
	        Matcher mtch1 = pattern1.matcher(rslt);
	       System.out.println("Enter your  full name");
	        String fullname=utility.inputString();
	       String rslt1= mtch1.replaceAll(fullname);
	       
	       Pattern pattern2 = Pattern.compile("[x]{10}");
	        Matcher mtch2 = pattern2.matcher(rslt1);
	       System.out.println("Enter your mobile number");
	        String number=utility.inputString();
	       String rslt2= mtch2.replaceAll(number);
	     
	       
	       Pattern pattern3 = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
	        Matcher mtch3 = pattern3.matcher(rslt2);
	       System.out.println("Enter date");
	        String date=utility.inputString();
	       String rslt3= mtch3.replaceAll(date);
	        System.out.println(rslt3);
	       
	    
	       
	        	 
	            
	             
	           		
		
	}
}
