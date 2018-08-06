package com.jda.utility;

public class Customer {
	public String mobileno;
	private String name;
	private String amount;
	public Customer(String name, String mobileno,  String amount){
		this.mobileno = mobileno;
		this.name = name;
		this.amount = amount;
	}
	

	public void setname(String name)
	{
		this.name = name;
	}
	public void setmobileno(String mobileno)
	{
		this.mobileno = mobileno;
	}
	public void setamount(String amount)
	{
		this.amount = amount;
	}
	public String getname()
	{
	
		return name;
	}
	public String getmobileno()
	{
		return mobileno;
	}
	public String getamount()
	{
		return amount;
	}
	
	@Override
	public String toString(){
		//return String.format(" + "\"No of Shares +" + quantity,name,price,quantity);
		return "{" + "\"name\":\"" + name + ",\"" + "\"mobileno\":\"" + mobileno + ",\"amount\":\"" + amount + "}";
	}

}
