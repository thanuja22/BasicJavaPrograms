package com.jda.utility;

public class Company {
	public String price;
	private String name;
	private String quantity;
	public Company(String name, String price,  String quantity){
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}
	

	public void setname(String name)
	{
		this.name = name;
	}
	public void setprice(String price)
	{
		this.price = price;
	}
	public void setquantity(String quantity)
	{
		this.quantity = quantity;
	}
	public String getname()
	{
	
		return name;
	}
	public String getprice()
	{
		return price;
	}
	public String getquantity()
	{
		return quantity;
	}
	
	@Override
	public String toString(){
		//return String.format(" + "\"No of Shares +" + quantity,name,price,quantity);
		return "{" + "\"name\":\"" + name + ",\"" + "\"noofshare\":\"" + quantity + ",\"shareprice\":\"" + price + "}";
	}
}
