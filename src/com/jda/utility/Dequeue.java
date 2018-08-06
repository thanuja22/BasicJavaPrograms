package com.jda.utility;

public class Dequeue<T extends Comparable<T>>{

	public DqNode<T> front= null;
	public DqNode<T> rear=null;
	public int size;
	
	public static class DqNode<S>
	{
		public S value;
		public DqNode<S> next;
		public DqNode<S> prev;
		DqNode(S data)
		{
			value=data;
			next=null;
			prev=null;
		}
	}
	public Dequeue()
	{
		rear=front=null;
	}
	
	public void insertEnd(T data)
	{
		DqNode<T> newnode=new DqNode<T>(data);
		if(rear==null)
		{
			rear=front=newnode;
			//System.out.println(rear.value);
			return;
		}
		newnode.prev=rear;
		rear.next=newnode;
		rear=newnode;
		size++;
		//System.out.println(rear.value);
		//System.out.println(size);
	}
	public void insertFront(T data)
	{
		DqNode<T> newnode=new DqNode<T>(data);
		if(front==null)
		{
			rear = front = newnode;
			return;
		}
		newnode.next = front;
		front.prev = newnode;
		front = newnode;
		size++;
	}
	public DqNode<T> deleteFront() {
		if (front == null)
			return null;
		DqNode<T> temp = front;
		//System.out.println(temp.value);
		front = front.next;
		//System.out.println(temp.value);
		if (front == null)
			rear = null;
		else
			front.prev = null;
		//System.out.println(size);
		size--;
		//System.out.println(size);
		return temp;

	}

	public DqNode<T> deleteEnd() {
		if (front == null)
			return null;
		DqNode<T> temp = rear;
		//System.out.println(temp.value);
		rear = rear.prev;
		if (rear == null)
			front = null;
		else
			rear.next = null;
		//System.out.println(size);
		size--;
		//System.out.println(size);
		return temp;
	}
}
