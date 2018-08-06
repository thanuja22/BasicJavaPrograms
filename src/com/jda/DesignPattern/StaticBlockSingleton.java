package com.jda.DesignPattern;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;

	private StaticBlockSingleton()
	{
		
	}
	static {
		try {
			instance=new StaticBlockSingleton();
		}catch(Exception e) {
			throw new RuntimeException("Exception occured in creating ssingleton instance");
		}
	}
	public static StaticBlockSingleton getInstance()
	{
		return instance;
	}
}
