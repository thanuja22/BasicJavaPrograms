package com.jda.ObjectOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.Utility;

public class Inventory1 {

	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
	{
		
		JSONParser parser=new JSONParser ();
		Object obj=parser.parse(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Input1.JSON"));
		 JSONObject jsonObject = (JSONObject) obj;
		 String str=(String)jsonObject.get("NAME");
		 System.out.println(str);
		 
		 String wt = null;
		 int amnt = 0;
		 
		 System.out.println("Rice:");
		 JSONArray Rice = (JSONArray) jsonObject.get("Rice");
		 Iterator<Map.Entry> itr1 = null ;
			Iterator itr11 = Rice.iterator();
			int totalPrice =0;
			int price =0;
			Utility util=new Utility();
			amnt=util.fun(itr11, itr1, amnt, price, wt);
			
			 System.out.println();
	        System.out.println("Pulses:");
	        JSONArray Pulses = (JSONArray) jsonObject.get("Pulses");
			 Iterator<Map.Entry> itr2 = null ;
				Iterator itr22 = Pulses.iterator();
	         
	        // iterating address Map
	        String wt2=null,wt3=null;
	      //  Iterator<Map.Entry>
	      //  System.out.println(amnt);
	        amnt=util.fun(itr22, itr2, amnt, price, wt2);
	    
	        System.out.println();
	        System.out.println("Wheat:");
	        JSONArray Wheat = (JSONArray) jsonObject.get("Wheat");
			 Iterator<Map.Entry> itr3 = null ;
				Iterator itr33 = Wheat.iterator();
			amnt=	util.fun(itr33, itr3, amnt, price, wt3);
	         
	      
			 System.out.println("Total Amount " +amnt);
	}

	}
