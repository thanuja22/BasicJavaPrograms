package com.jda.DesignPattern;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	public static void main(String[] args) {
        EagerInitializationImplement instanceOne = EagerInitializationImplement.getInstance();
        EagerInitializationImplement instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializationImplement.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializationImplement) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
