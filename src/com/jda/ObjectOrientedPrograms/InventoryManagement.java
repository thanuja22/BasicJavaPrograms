package com.jda.ObjectOrientedPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.util.DefaultPrettyPrinter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.Utility;

class Details {
	public double price;
	private String name;
	private int quantity;
	public Details(String name, double price,  int quantity){
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}
	

	public void setname(String name)
	{
		this.name = name;
	}
	public void setprice(double price)
	{
		this.price = price;
	}
	public void setquantity(int quantity)
	{
		this.quantity = quantity;
	}
	public String getname()
	{
	
		return name;
	}
	public double getprice()
	{
		return price;
	}
	public int getquantity()
	{
		return quantity;
	}
	
	@Override
	public String toString(){
		//return String.format(" + "\"No of Shares +" + quantity,name,price,quantity);
		return "{" + "\"name\":\"" + name + ",\"" + "\"noofshare\":\"" + quantity + ",\"shareprice\":\"" + price + "}";
	}
	
}

public class InventoryManagement {
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
			int price =0,a=0,quantity=0;
			String name=null;
			Details d=new Details(null, 0, 0);
			 ArrayList<Details> lst = new ArrayList<Details>(); 
			while (itr11.hasNext()) 
		     {
		         itr1 = ((Map) itr11.next()).entrySet().iterator();
			   while (itr1.hasNext()) {
		            Map.Entry pair = itr1.next();
		            if((pair.getKey()).equals("Stock Name"))
		            {
		            	name=(String) pair.getValue();
		            	// System.out.println(wt);
		            }
		            if((pair.getKey()).equals("No of Shares"))
		            {
		            	wt=(String) pair.getValue();
		            	// System.out.println(wt);
		            }
		           
		            if((pair.getKey()).equals("Stock Price"))
		            {
		            	String val=(String) pair.getValue();
		            //	System.out.println(val);
		            
		            	//System.out.println(w);
		            	 price=Integer.parseInt(val);
		            	//System.out.println(a);
		            	
		            }
		        	 quantity=Integer.parseInt(wt);
		           
		        }
			 //  System.out.println(name);
			 d=new Details(name, price, quantity);
			
			 lst.add(d);
			//d.setname(name);
		//	d.setprice(price);
		//	d.setquantity(quantity);
			System.out.println(d);
			
		//	inv.addProduct(d);
			amnt+=d.getprice()*d.getquantity();
		        
			     }
		//	inv.printInventory();
			System.out.println(amnt);
			
			
			
			Utility util=new Utility();
			int size=Stock.size();
			
			System.out.println("Enter 1 to remove 2 to add");
			int ch=util.inputInt();
			if(ch==1)
			{
			System.out.println("Enter position to remove");
			int position=util.inputInt();
			//Remove the element from arraylist
			
			//list.remove(position);
			//System.out.println(lst.get(position));
			Stock.remove(position);
			}
			//System.out.println(Stock.size());
			if(ch==2)
			{
				System.out.println("Enter position to add");
				int position=util.inputInt();
				System.out.println("Enter details to add");
				System.out.println("Enter name to add");
				String name1=util.inputString();
				System.out.println("Enter price to add");
				double price1=util.inputDouble();
				System.out.println("Enter quantity to add");
				int quantity1=util.inputInt();
			d=new Details(name1,price1,quantity1);
			System.out.println(d);
			JSONObject jsonObject2 = (JSONObject) obj;
			//jsonObject2.put("Stock Name", name1);
		//	jsonObject2.put("Stock Price", price1);
		//	jsonObject2.put("No of Shares", quantity1);
			//Stock.add(position, jsonObject2);
			Stock.add(position, d);
			
			size=Stock.size();
			}
		
			System.out.println(size);
	/*	for(int i=0;i<size;i++)
		{
			System.out.println(Stock.get(i));
			
		} */
		JSONObject jsonObject1 = (JSONObject) obj;
		
		
		jsonObject1.put("STOCK", Stock);
	
			FileWriter file = new FileWriter("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Stock.JSON");
			//	file.write(jsonObject1.toJSONString());
		//file.write((String) obj);
			//	jsonObject1.writeJSONString(file);
		//	jsonObject1.writeJSONString(file);
			ObjectMapper mapper = new ObjectMapper();
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			// variable.add(3,inventory);
			writer.writeValue(new File("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Stock.JSON"), jsonObject1);
				file.flush();
				file.close();
				//System.out.println("Successfully Copied JSON Object to File...");
				System.out.println("\nJSON Object: " + obj);
	
		}

}
