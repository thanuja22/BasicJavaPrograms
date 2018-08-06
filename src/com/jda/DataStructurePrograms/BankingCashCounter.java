package com.jda.DataStructurePrograms;

import com.jda.utility.Queue;
import com.jda.utility.Queue.Qnode;
import com.jda.utility.Utility;

public class BankingCashCounter {

	public static void main(String args[]) {
		System.out.println("please enter the cash available in the bank"); 
		Utility utility = new Utility();
		int total = utility.inputInt();
		Queue<Integer> queue = new Queue<Integer>();//create queue
		System.out.println("please enter the no.of persons in queue");
		int persons = utility.inputInt();
		
		/*For the entry of 1st person 
		 * if the purpose is deposit,
		 *  we are enqueue'ing the
		 *  amount and purpose in that particular node
		 *  similarly for withdrawal
		 */
		
		for (int i = 0; i < persons; i++) {

			System.out.println("please enter the purpose");
			String purpose = utility.inputString();
			if (purpose.compareTo("deposit") == 0) {
				System.out.println(i+1+"   person please enter the amount you want to deposit");
				int amount = utility.inputInt();
				queue.enqueuebank(amount, purpose);

			} else {
				System.out.println(i+1+"  please enter the amount you want to withdraw");
				int amount = utility.inputInt();
				queue.enqueuebank(amount, purpose);

			}
		}
		
		
		for (int i = 0; i < persons; i++) {
			Qnode<Integer> temp = queue.dequeue();
			if (temp.purpose.compareTo("deposit") == 0)//for deposit add the node value to the total
			{
				total += temp.value;
				System.out.println(i+1+"   person money successfully deposited");
			}
			else {
				if (total - temp.value < 0)//if the difference of total the amount to be withdrawn is less than zero withdrawal isn't possible
					System.out.println(i+1+" no sufficient money in bank for withdrawl amount,please visit again");
				else
				{
					total -= temp.value;// if the available balance is greater than the amount to be withdrawn then decrement this amount from total
					System.out.println(i+1+"   person money successfully withdrawed");
				}
			}
		}
		System.out.println("Amount in bank"+total);//total balance
	}
}
