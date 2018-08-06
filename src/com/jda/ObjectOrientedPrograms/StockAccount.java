package com.jda.ObjectOrientedPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;












import org.codehaus.jackson.map.ObjectMapper;



import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.LinkedList;
import com.jda.utility.Transaction;
import com.jda.utility.Company;
import com.jda.utility.Customer;
import com.jda.utility.LL;
/*
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper; */
import com.jda.utility.Utility;


public class StockAccount {
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
	{
		
		 int ch=1;
		 while(ch==1)
		 {
	JSONParser parser=new JSONParser ();
	Object obj=parser.parse(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Customer.JSON"));
	 JSONObject jsonObject = (JSONObject) obj;
	 JSONArray Customer = (JSONArray) jsonObject.get("CUSTOMER");
	 ArrayList<Customer> lst1 = new ArrayList<Customer>(); 
	 
	//ll<Customer> lst =new ll<Customer>();
	 
	 Object obj1=parser.parse(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Stock.JSON"));
	 JSONObject jsonObject1 = (JSONObject) obj1;
	 JSONArray Stock = (JSONArray) jsonObject1.get("STOCK");
	 ArrayList<Company> lst2 = new ArrayList<Company>(); 
	 
	 
	 Object obj3=parser.parse(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Transaction.JSON"));
	 JSONObject jsonObject5 = (JSONObject) obj3;
	 JSONArray Transaction = (JSONArray) jsonObject5.get("TRANSACTION");
	 ArrayList<Transaction> lst3 = new ArrayList<Transaction>(); 
	
	 
	/* ObjectMapper mapper = new ObjectMapper();
     // read JSON from a file
     Map<String, Object> stock = mapper.readValue(new File(
             "C:/practise/BasicJavaPrograms/src/com/jda/ObjectOrientedPrograms/Stock.JSON"),
             new TypeReference<Map<String, Object>>(){});
     
     System.out.println(stock.get("No of Shares"));
     
    ObjectMapper mapper1 = new ObjectMapper();
     // read JSON from a file
     Map<String, Object> customer = mapper1.readValue(new File(
             "C:/practise/BasicJavaPrograms/src/com/jda/ObjectOrientedPrograms/Customer.JSON"),
             new TypeReference<Map<String, Object>>(){});
     System.out.println(stock.get("Customer Name"));  */
	// System.out.println(Customer.get(1));
	
	 int size=Customer.size();
	 String amt=null;
	 Utility util=new Utility();
	 System.out.println("Enter the person");
	 String str=util.inputString();
	// Customer cus=new Customer();
	 
	 for(int i=0;i<size;i++)
	 {
		 //com.jda.ObjectOrientedPrograms.Customer jsonObject2 = (com.jda.ObjectOrientedPrograms.Customer) obj;
		// jsonObject2=(com.jda.ObjectOrientedPrograms.Customer) Customer.get(i);

		 JSONObject jsonObject2 = (JSONObject) obj;
		 jsonObject2=(JSONObject) Customer.get(i);
		 Customer cus=new Customer((String)jsonObject2.get("Customer Name"), (String)jsonObject2.get("Mobile no"),(String) jsonObject2.get("Amount"));
		// d=new Details(name, price, quantity);
			
		 lst1.add(cus);
		// lst1.add(jsonObject2);
		 
		// lst.adds((String)jsonObject2.get("Customer Name"), (String)jsonObject2.get("Mobile no"),(String) jsonObject2.get("Amount"));
		// String n= (String) jsonObject2.get("Customer Name");
		 String n=lst1.get(i).getname();
		// System.out.println(n);
		 if(n.equals(str))
		 {
		  //amt=(String) jsonObject2.getamount();
			 amt= lst1.get(i).getamount();
		 }
		 
	 }
	// System.out.println(Integer.parseInt(amnt));
	
	
	 int size1=Stock.size();
	 String prices=null;
	 String numb=null;
	// utility util=new utility();
	 System.out.println("Enter the company name");
	 String str1=util.inputString();
	// Customer cus=new Customer();
	 for(int i=0;i<size1;i++)
	 {
		 JSONObject jsonObject2 = (JSONObject) obj;
		 jsonObject2=(JSONObject) Stock.get(i);
		 Company com=new Company((String)jsonObject2.get("Stock Name"), (String)jsonObject2.get("Stock Price"),(String) jsonObject2.get("No of Shares"));
		// d=new Details(name, price, quantity);
			
		 lst2.add(com);
		// String n= (String) jsonObject2.get("Stock Name");
		// System.out.println(n);
		//String n=jsonObject2.getname();
		String n=lst2.get(i).getname();
		 if(n.equals(str1))
		 {
		//  prices=(String) jsonObject2.get("Stock Price");
		//  numb=(String) jsonObject2.get("No of Shares");
			 prices=lst2.get(i).getprice();
			 numb=lst2.get(i).getquantity();
		 }
		 
		 
	 }
	 int amnt=Integer.parseInt(amt);
	 int price=Integer.parseInt(prices);
	 int num=Integer.parseInt(numb);
	 int shares=0;
	 System.out.println("Enter no of shares u want to buy");
	 int shares1=util.inputInt();
	 int fnl=0;
	// System.out.println(Integer.parseInt(amnt));
	 if(amnt>=price)
	 {
		
		  shares=amnt/price;
		  if(num>shares1)
		  {
		  if(shares>shares1)
		  {
			  amnt=(amnt-(shares1*price));
			  fnl=shares1;
		  }
		  else
		  { amnt=(amnt-(shares*price));
			  fnl=shares;
		  }
		
		 }
		  else
		  {
			  if(shares>num)
			  {
				  amnt=(amnt-(num*price));
				  fnl=num;
			  }
			  else
			  { amnt=(amnt-(shares*price));
				  fnl=shares;
			  }  
		  }
	 }
	 
	 else
	 {
		 System.out.println("U can't invest");
	 }
	 System.out.println("no of shares" +fnl);
	 System.out.println("Final amount" +amnt);
	 for(int i=0;i<size;i++)
	 {
		 JSONObject jsonObject2 = (JSONObject) obj;
		 jsonObject2=(JSONObject) Customer.get(i);
		// String n= (String) jsonObject2.get("Customer Name");
		// System.out.println(n);
		 String n=lst1.get(i).getname();
		 if(n.equals(str))
		 {
			 String am=Integer.toString(amnt);
		 jsonObject2.put("Amount", am);
		// Customer.add(i,jsonObject2);
		 break;
		 }
		 
	 } 
	 
	 
	 
			 
	 JSONObject jsonObject3 = (JSONObject) obj;
		
		
		jsonObject3.put("CUSTOMER", Customer);
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
		// variable.add(3,inventory);
		writer.writeValue(new File("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Customer.JSON"), jsonObject3);
			
		for(int i=0;i<size1;i++)
		 {
			 JSONObject jsonObject2 = (JSONObject) obj1;
			 jsonObject2=(JSONObject) Stock.get(i);
			// String n= (String) jsonObject2.get("Stock Name");
			 String n=lst2.get(i).getname();
			// System.out.println(n);
			 if(n.equals(str1))
			 {
				 String am=Integer.toString((num-fnl));
				 jsonObject2.put("No of Shares",am );
					// Customer.add(i,jsonObject2);
					 break;
			 }
			 
		 }
		
JSONObject jsonObject4 = (JSONObject) obj1;
		
		
		jsonObject4.put("STOCK", Stock);
	//	ObjectMapper mapper1 = new ObjectMapper();
	//	ObjectWriter writer1 = mapper1.writer(new DefaultPrettyPrinter());
		// variable.add(3,inventory);
		writer.writeValue(new File("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Stock.JSON"), jsonObject4);
		
		//JSONArray Transaction =new JSONArray();
		int val=Integer.parseInt(amt);
		val=val-amnt;
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		//String vall=Integer.toString(val);
		 Transaction trans=new Transaction(str, str1, val, fnl, timeStamp);
		 Transaction.add(trans);
		 JSONObject jsonObject6 = (JSONObject) obj3;
			jsonObject6.put("TRANSACTION", Transaction);
			writer.writeValue(new File("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Transaction.JSON"), jsonObject6);
		
		
	 System.out.println("Customer Details" +obj);
	 System.out.println("Stock Details" +obj1);
	 System.out.println("Transaction Details" +obj3);
	// System.out.println(lst.size());
	 System.out.println("enter 1 to continue");
	 ch=util.inputInt();
	 }
	}

}
