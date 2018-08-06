package com.jda.DesignPattern;

public class EagerInitializationImplement {
private static final EagerInitializationImplement instance=new EagerInitializationImplement();
	
	private EagerInitializationImplement() {
		
	}
	public static EagerInitializationImplement getInstance()
	{
		return instance;
	}
}
