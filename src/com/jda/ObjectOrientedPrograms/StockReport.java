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

public class StockReport {
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser=new JSONParser ();
		Object obj=parser.parse(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Stock.JSON"));
		 JSONObject jsonObject = (JSONObject) obj;
		 
		 String wt = null;
		 int amnt = 0;
		
		 System.out.println("Stock Report:");
		 JSONArray Stock = (JSONArray) jsonObject.get("STOCK");
		 Iterator<Map.Entry> itr1 ;
			Iterator itr11 = Stock.iterator();
			int totalPrice =0;
			int price =0;
			
			while (itr11.hasNext()) 
		     {
		         itr1 = ((Map) itr11.next()).entrySet().iterator();
		
		         int a=0;
	        while (itr1.hasNext()) {
	            Map.Entry pair = itr1.next();
	            if((pair.getKey()).equals("No of Shares"))
	            {
	            	wt=(String) pair.getValue();
	            	
	            }
	           
	            if((pair.getKey()).equals("Stock Price"))
	            {
	            	String val=(String) pair.getValue();
	            
	            	 a=Integer.parseInt(val);
	            	
	            	
	            }
	        	int w=Integer.parseInt(wt);
	        	int b=w*a;
         
            
            	amnt=amnt+b;
            	
          	
	           
	           
	        }
	        System.out.println("Stocks Price till now " +amnt);
	       
		     }
			 System.out.println("Total Stocks Price " +amnt);
	}

}
