package com.jda.AddressBook;

public class Person {
String firstName;
String lastName;
Address address;
String phoneNumber;

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName=firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName)
{
	this.lastName=lastName;
}
public Address getAddress()
{
	return address;
}
public void setAddress(Address address) {
	this.address=address;
}
public String toString()
{
	return "\n\t\t\tPerson \n\t\t\t\tFirst Name : " + firstName + "\n\t\t\t\tLast Name  : " + lastName + "\n\t\t\t\tAddress  " + address + "\n\t\t\t\tPhone Number : "
			+ phoneNumber + "\n\n";
}
}
