package com.jda.AddressBook;

public class Address {
String city;
String state;
long zip;

public String getCity()
{
	return city;
}

public void setCity(String city)
{
	this.city=city;
}
public String getState()
{
	return state;
}
public void setState(String state)
{
	this.state=state;
}
public long getZip()
{
	return zip;
}
public void setZip(long zip)
{
	this.zip=zip;
}
public String toString()
{
	return "\n\t\t\t\t   City  : " + city + "\n\t\t\t\t   State : " + state + "\n\t\t\t\t   Zip   : " + zip ;
}
}
