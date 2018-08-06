package com.jda.DesignPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		SerializedSingleton instanceOne=SerializedSingleton.getInstance();
	//serialization
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("filename.ser"));
		// Method for serialization of object
		out.writeObject(instanceOne);
		out.close();
		
		//Deserialization
		ObjectInput in=new ObjectInputStream(new FileInputStream("Filename.ser"));
		//Method for Deserialization of object
		SerializedSingleton instanceTwo=(SerializedSingleton) in.readObject();
		in.close();
		
		System.out.println("instanceOne hashcode="+instanceOne.hashCode());
		System.out.println("instanceTwo hashcode="+instanceTwo.hashCode());
		
	}
}
