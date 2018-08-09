package com.jda.ObjectOrientedPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.jda.utility.Utility;

public class StockAccountImpl {
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
	{
			
		int ch=1;
		while(ch==1)
		{
		JSONParser parser=new JSONParser ();
		Object obj=parser.parse(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Customer.JSON"));
		 JSONObject jsonObject = (JSONObject) obj;
		 JSONArray Customer = (JSONArray) jsonObject.get("CUSTOMER");
		 ArrayList<Customer> list = new ArrayList<Customer>(); 
		 
		 
		 
		 Object obj1=parser.parse(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedProgramsCompany.JSON"));
		 JSONObject jsonObject1 = (JSONObject) obj1;
		 JSONArray Stock = (JSONArray) jsonObject1.get("Company");
		 ArrayList<Company> lst2 = new ArrayList<Company>(); 
		 
		 
		 Object obj3=parser.parse(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Transactions.JSON"));
		 JSONObject jsonObject5 = (JSONObject) obj3;
		 JSONArray Transaction = (JSONArray) jsonObject5.get("TRANSACTION");
		 ArrayList<Transaction> lst3 = new ArrayList<Transaction>(); 
		 
		 
		 
		 int size=Customer.size();
			
		 String amt=null;
		 Utility utility=new Utility();
		 System.out.println("Enter the person");
		 String str=utility.inputString();
		// Customer cus=new Customer();
		 
		 for(int i=0;i<size;i++)
		 {
			 

			 JSONObject jsonObject2 = (JSONObject) obj;
			 jsonObject2=(JSONObject) Customer.get(i);
			 Customer cus=new Customer((String)jsonObject2.get("customerName"), (String)jsonObject2.get("mobileno"),(String) jsonObject2.get("amount"));
			
				
			 list.add(cus);
			
			 String n=list.get(i).getcustomerName();
			
			// System.out.println(n);
			 if(n.equals(str))
			 {
			  //amt=(String) jsonObject2.getamount();
				 amt= list.get(i).getAmount();
			 }
			 
		 }
		 
		 
		 Customer cust=new Customer(null,null,null);
		 System.out.println("Want to add a new customer enter 1");
		 int che=utility.inputInteger();
		 if(che==1)
		 {
			 System.out.println("Enter customer name");
			 String st=utility.inputString();
			 System.out.println("Enter mobile no");
			 String mo=utility.inputString();
			 System.out.println("Enter amount");
			 String money=utility.inputString();
			  cust=new Customer(st,mo,money);
			 list.add(cust);
			 Customer.add(cust);
		 } 
		// System.out.println(Integer.parseInt(amnt));
		
		
		 int size1=Stock.size();
		 String prices=null;
		 String numb=null;
		
		 System.out.println("Enter the company name");
		 String str1=utility.inputString();
		
		 for(int i=0;i<size1;i++)
		 {
			 JSONObject jsonObject2 = (JSONObject) obj;
			 jsonObject2=(JSONObject) Stock.get(i);
			 Company com=new Company((String)jsonObject2.get("stockName"), (String)jsonObject2.get("stockPrice"),(String) jsonObject2.get("noofShares"));
			// d=new Details(name, price, quantity);
				
			 lst2.add(com);
			// String n= (String) jsonObject2.get("Stock Name");
			// System.out.println(n);
			//String n=jsonObject2.getname();
			String n=lst2.get(i).getStockName();
			 if(n.equals(str1))
			 {
			//  prices=(String) jsonObject2.get("Stock Price");
			//  numb=(String) jsonObject2.get("No of Shares");
				 prices=lst2.get(i).getStockPrice();
				 numb=lst2.get(i).getNoOfShares();
			 }
			 
			 
		 }
		 
		 
		 System.out.println("Want to add a new Company enter 1");
		 int chek=utility.inputInteger();
		 if(chek==1)
		 {
			 System.out.println("Enter Company name");
			 String st=utility.inputString();
			 System.out.println("Enter Stock price");
			 String priced=utility.inputString();
			 System.out.println("Enter No of shares");
			 String nb=utility.inputString();
			 Company comp=new Company(st,priced,nb);
			 lst2.add(comp);
			 Stock.add(comp);
		 }  
		 int amnt=Integer.parseInt(amt);
		 int price=Integer.parseInt(prices);
		 int num=Integer.parseInt(numb);
		 int shares=0;
		 System.out.println("Enter no of shares u want to buy");
		 int shares1=utility.inputInteger();
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
			 String n=list.get(i).getcustomerName();
			 if(n.equals(str))
			 {
				 String am=Integer.toString(amnt);
			 jsonObject2.put("amount", am);
			// Customer.add(i,jsonObject2);
			 break;
			 }
			 
		 } 
		 System.out.println("Enter 1 to update");
		 int gh=utility.inputInteger();
		 if(gh==1)
		 {
		 for(int i=0;i<size;i++)
		 {
			 JSONObject jsonObject2 = (JSONObject) obj;
			 jsonObject2=(JSONObject) Customer.get(i);
			// String n= (String) jsonObject2.get("Customer Name");
			// System.out.println(n);
			 String n=list.get(i).getcustomerName();
			 if(n.equals(str))
			 {
				// String am=Integer.toString(amnt);
				 System.out.println("Enter amount to update");
				 String am=utility.inputString();
			 jsonObject2.put("amount", am);
			// Customer.add(i,jsonObject2);
			 break;
			 }
			 
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
				 String n=lst2.get(i).getStockName();
				// System.out.println(n);
				 if(n.equals(str1))
				 {
					 String am=Integer.toString((num-fnl));
					 jsonObject2.put("noofShares",am );
						// Customer.add(i,jsonObject2);
						 break;
				 }
				 
			 }
			
			
			JSONObject jsonObject4 = (JSONObject) obj1;
			
			
			jsonObject4.put("STOCK", Stock);
		//	ObjectMapper mapper1 = new ObjectMapper();
		//	ObjectWriter writer1 = mapper1.writer(new DefaultPrettyPrinter());
			// variable.add(3,inventory);
			writer.writeValue(new File("C:\\\\Users\\\\1023340\\\\eclipse-workspace\\\\JAVAPROJECT\\\\src\\\\com\\\\jda\\\\objectorientedprograms\\\\input\\\\Stock.JSON"), jsonObject4);
			
			//JSONArray Transaction =new JSONArray();
			int val=Integer.parseInt(amt);
			val=val-amnt;
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			//String vall=Integer.toString(val);
			 Transaction trans=new Transaction(str, str1, val, fnl, timeStamp);
			 Transaction.add(trans);
			 JSONObject jsonObject6 = (JSONObject) obj3;
				jsonObject6.put("TRANSACTION", Transaction);
				writer.writeValue(new File("C:\\\\Users\\\\1023340\\\\eclipse-workspace\\\\JAVAPROJECT\\\\src\\\\com\\\\jda\\\\objectorientedprograms\\\\input\\\\Transaction.JSON"), jsonObject6);
			
			
		 System.out.println("Customer Details" +obj);
		 System.out.println("Stock Details" +obj1);
		 System.out.println("Transaction Details" +obj3);
		// System.out.println(lst.size());
		 System.out.println("enter 1 to continue");
		 ch=utility.inputInteger();
		 }
		}

}
