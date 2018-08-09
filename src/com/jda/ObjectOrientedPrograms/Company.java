package com.jda.ObjectOrientedPrograms;

public class Company {
	public int stockPrice;
	private String stockName;
	private int noofShares;
	public Company(String stockName, int stockPrice, int noOfShares){
		this.stockPrice = stockPrice;
		this.stockName = stockName;
		this.noofShares = noOfShares;
	}
	

	public void setStockName(String stockName)
	{
		this.stockName = stockName;
	}
	public void setStockPrice(int stockPrice)
	{
		this.stockPrice = stockPrice;
	}
	public void setnoOfShares(int noOfShares)
	{
		this.noofShares = noOfShares;
	}
	public String getStockName()
	{
	
		return stockName;
	}
	public int getStockPrice()
	{
		return stockPrice;
	}
	public int  getNoOfShares()
	{
		return noofShares;
	}
	
	@Override
	public String toString(){
		//return String.format(" + "\"No of Shares +" + quantity,name,price,quantity);
		return "{" + "\"stockName\":\"" + stockName + ",\"" + "\"noOfShares\":\"" + noofShares + ",\"stockPrice\":\"" + stockPrice + "}";
	}
}
