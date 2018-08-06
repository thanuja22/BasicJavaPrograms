package com.jda.utility;

import com.jda.utility.UnorderedList;
public class Stack<T extends Comparable<T>> {
	UnorderedList<T> list = new UnorderedList<T>();

	public void push(T data) {
		list.add(data);
	}

	public T pop() {

		 return list.remove();
	}
	public T peak()
	{
		return list.peek();
	}
	public int size()
	{
		return list.size();
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	
}