package com.jda.utility;

public class Queue<T extends Comparable<T>> {
	public Qnode<T> front = null;
	public Qnode<T> rear = null;

	// A linked list (LL) node to store a queue entry
	public static class Qnode<S> {
		public S value;
		public Qnode<S> next;
        public String purpose=null;
        Qnode(S data)  // constructor to create a new linked list node
        {value = data;
		next = null;
        }
		Qnode(S data,String pur) { //Parameterized constructor to create a new linked list node of with 
			value = data;
			purpose=pur;
			next = null;
		}
	}

	public Queue() { //default queue constructor initializing rear and front
		rear = front = null;
	}
	public void enqueue(T data) { //enqueue data to rear 
		Qnode<T> newnode = new Qnode<T>(data); //creating newnode containing data 
		if (rear == null) {  //if rear is null newnode
			rear = front = newnode;
			return;
		}
		rear.next = newnode;//link the newnode
		rear = newnode;//newnode becomes the new rear
	}
	public void enqueuebank(T data,String purpose) {
		Qnode<T> newnode = new Qnode<T>(data,purpose);
		if (rear == null) {
			rear = front = newnode;
			return;
		}
		rear.next = newnode;
		rear = newnode;
	}

	public Qnode<T> dequeue() {//dequeue from front
		if (front == null)//if front is null no element to dequeue
			return null;
		Qnode<T> temp=front;
		front = front.next;//shifting the front to next entry
		if (front == null)
			rear = null;
		return temp;//return the front

	}
	 public int add(int cash,int num)
	 {
		 int key,data,value=cash;
		
			for(int i=0;i<num;i++)
			{
				System.out.println("Enter details of customer" +(i+1));
				System.out.println("Enter amount of customer" +(i+1));
				 data=util.inputInteger();
				System.out.println("Enter 1 for deposit 2 for withdraw" );
				 key=util.inputInteger();
				
				enqueue(key, data);
				value=check(value,num);
			}
			
			// int value=check(cash,num);
			 return value;
	 }
	
}