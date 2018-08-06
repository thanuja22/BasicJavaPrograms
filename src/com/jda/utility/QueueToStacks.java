package com.jda.utility;

public class QueueToStacks<T extends Comparable<T>> {

	public Stack<T> stack1 = new Stack<T>();
	public Stack<T> stack2 = new Stack<T>();

	public void enqueue(T data) {
		stack1.push(data); //pushing into the stack is similar to enqueuing in queue

	}
/*but in the case of dequeue it is the case FIFO unlike stack where pop is FILO 
 * so we are popping from stack1 and pushing into stack2  
 * popping stack2 returns the right element.
 */
	
	public T dequeue() {
		
		if (stack1.isEmpty() && stack2.isEmpty())//if both stacks are empty return null
			return null;
		if (stack2.isEmpty()) { //while stack2 is empty
			while(!stack1.isEmpty())//if stack1 is not empty
			{
				stack2.push(stack1.pop());//pushing elements for stack1 pop into stack2
				
			}
		}
		

	return stack2.pop();//pop stack2 returns FIFO
}
}
