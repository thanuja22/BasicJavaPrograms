package com.jda.utility;

public class Transaction {
	private String name;
	private String stockname;
	private int amount;
	private int stock;
	private String timeStamp;
	public Transaction(String name, String stockname, int amount, int stock, String timeStamp){
	//	this.mobileno = mobileno;
		this.name = name;
		this.stockname=stockname;
		this.amount = amount;
		this.stock =stock;
		this.timeStamp=timeStamp;
	}
	

	public void setname(String name)
	{
		this.name = name;
	}
	
	public void setstockname(String stockname)
	{
		this.stockname = stockname;
	}
	
	public void settimeStamp(String timeStamp)
	{
		this.timeStamp = timeStamp;
	}
	
	public void setamount(int amount)
	{
		this.amount = amount;
	}
	
	public void setstock(int stock)
	{
		this.stock = stock;
	}
	public String getname()
	{
	
		return name;
	}
	
	public String getstockname()
	{
	
		return stockname;
	}
	
	public String gettimeStamp()
	{
	
		return timeStamp;
	}
	
	public int getamount()
	{
		return amount;
	}
	
	public int getstock()
	{
		return stock;
	}
	
	@Override
	public String toString(){
		//return String.format(" + "\"No of Shares +" + quantity,name,price,quantity);
		return "{" + "\"name\":\"" + name + ",\"" + "\"stockname\":\"" + stockname + ",\"amount\":\"" + amount + ",\"stock\":\"" + stock + ",\"timeStamp\":\"" + timeStamp + "}";
	}
}
