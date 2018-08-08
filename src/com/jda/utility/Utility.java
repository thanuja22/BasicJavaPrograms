package com.jda.utility;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 */
import java.util.Scanner;
import java.util.Stack;
public class Utility {
	
		
	
	static Scanner scanner;
	public String[] months = new String[] {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	public char[] dayNotation = new char[] {'S','M','T','W','T','F','S'};
	public int[] days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
	
/**
 * default constructor for  scanner
 */
	public Utility() {
		scanner = new Scanner(System.in);
	}
/**
 * Method for replace string
 * @return
 */
	public static String inputString(){
		return scanner.next();
		
	}
	
	public boolean inputBoolean()
	{
		return scanner.nextBoolean();
	}
	/**
	 * method for leap year
	 * @return
	 */
	public static int inputInt()
	{
		
		return scanner.nextInt();
	}
	public double inputDouble()
	{
		return scanner.nextDouble();
	}
	/**
	 * method for power of 2
	 * @return
	 */
	public int inputIndex()
	{
		return scanner.nextInt();
	}

	public String replaceString(String template, String name) {
		template = template.replace("<<Username>>", name);
		return template;

	}
	public Boolean leapYear(int input) {
		Boolean leap;
		if (input % 400 == 0 || input % 100 == 0 && input % 4 == 0)
			leap = true;
		else
			leap = false;

		return leap;
	}
	public static void flipCoin(){
		if(Math.random()<0.5)
		{
			System.out.println("tails");
		 
			
		}
		else 
		{
			System.out.println("heads");
			
			
		
		}
	}
	public static void exponent(int index){
		int N=index;
		for(int i=0;i<=N;i++){
			double value=Math.pow(2, i);
			System.out.println(value);
			System.out.println();
		}
		
	}
	public static void harmonic(int index)
	{
		
		int N=index;
		double sum=0;
		for(int j=1;j<=N;j++){
			sum=sum+(1.0/j);
			
		}
		System.out.println("Sum is :" +" "+ sum);
		
		
	}
	public static void primefactors(int number)
	{
		int N=number;
		if (N%2==0){
			System.out.println(2+ " ");
			N/=2;
		}
		for(int i=3;i<=N*N;i+=2)
		{
			while(N%i==0)
			{
				System.out.println(i+ "  ");
				N/=i;
			
			}
		}
		if(N>2)
		{
			System.out.println(N +" ");
		}
	}
	public static void gambler(int s,int g,int n)
	{
		int stake=s;
		int goal=g;
		int t=n;
		int bets=0;
		int wins=0;
		for(int i=0;i<t;i++)
		{
			int cash = stake;
         while (cash > 0 && cash < goal) {
             bets++;
             if (Math.random() < 0.5) cash++;     // win $1
             else                     cash--;     // lose $1
         }
         if (cash == goal) wins++;                // did gambler go achieve desired goal?
     }
		 // print results
      System.out.println(wins + " wins of " + t);
      System.out.println("Percent of games won = " + 100.0 * wins / t);
      System.out.println("Avg # bets           = " + 1.0 * bets / t);
		}
		

public static int getCoupon(int n) {
   return (int) (Math.random() * n);
}

// return number of cards you collect before obtaining one of each of the n types
public static int collect(int n) {
   boolean[] isCollected = new boolean[n];  // isCollected[i] = true if card type i already collected
   int count = 0;                           // number of cards collected
   int distinct  = 0;                       // number of distinct card types collected

   // repeat until you've collected all n card types
   while (distinct < n) {
       int value = getCoupon(n);            // pick a random card 
       count++;                             // one more card
       if (!isCollected[value]) {           // discovered a new card type
           distinct++;
           isCollected[value] = true;
       }
   }
   return count;
}
public static int[][]  twoDimArrayInt(int m,int n)
{
	int a[][]=new int[m][n];
	System.out.println("integer array");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			Scanner scan=new Scanner(System.in);
			a[i][j]=scan.nextInt();
			
			
			
		}
	}
	return a;
}
public static double[][] twoDimArrayDouble(int m,int n)
{
	double b[][]=new double[m][n];
	System.out.println("double array");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++){
			Scanner scan=new Scanner(System.in);
			b[i][j]=scan.nextDouble();
		}
	}
	return b;
}
public static boolean[][] twoDimArrayBoolean(int m,int n)
{
	boolean c[][]=new boolean[m][n];
	System.out.println("Boolean array");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++){
			Scanner scan=new Scanner(System.in);
			c[i][j]=scan.nextBoolean();
		}
	}
	return c;
}
public static void display(int a[][],double b[][],boolean c[][],int m,int n)
{
	PrintWriter pw=new PrintWriter(System.out,true);
	
	//display integers
	System.out.println();
	pw.println("2D ARRAY INTEGER");
	
	for(int i = 0; i<m; i++)
	{
		for (int j = 0; j<n; j++)
        {
			pw.print("\t"+a[i][j]+" ");
        } 
     pw.println("\t");
}
	//display double
	System.out.println();
	pw.println("2D ARRAY DOUBLE");
		
	for(int i = 0; i<m; i++)
	{
		for (int j = 0; j<n; j++)
	    {
			pw.print("\t"+b[i][j]+" ");
	    } 
	pw.println("\t");
	}
		 
	//display boolean
	System.out.println();
	pw.println("2D ARRAY BOOLEAN");
			
	for(int i = 0; i<m; i++)
	{
		for (int j = 0; j<n; j++)
		{
			pw.print("\t"+c[i][j]+" ");
		} 
	pw.println("\t");
	}
}
public int[] arrayInput(int N)
{
	int a[]=new int[N];
	for(int i=0;i<N;i++)
	{
		Scanner scan=new Scanner(System.in);
		a[i]=scan.nextInt();
	}
	return a;
}
public static String[] arrayStringInput(int N)
{
	String a[]=new String[N];
	for(int i=0;i<N;i++)
	{
		Scanner scan=new Scanner(System.in);
		a[i]=scan.next();
	}
	return a;
}
public int sumOfThree(int N,int b[])
{
	int i,j,k,count=0;
	for(i=0;i<N;i++){
		for(j=i+1;j<N;j++)
		{
			for(k=j+1;k<N;k++)
			{
				if(b[i]+b[j]+b[k]==0)
				{
					
					System.out.println("distinct triplets are : "+b[i]+b[j]+b[k]);
					count++;
					
				}
				
			}
		}
	}
	return count;
}
public static double distance(int x,int y)
{
double xvalue=Math.pow(x, 2);
double yvalue=Math.pow(y, 2);
double value=xvalue+yvalue;
double dst=Math.sqrt(value);
return dst;
}

public static void  quadratic(int a,int b,int c)
{
double[] array=new double[2];
double delta=b*b-4*a*c;
array[0]=((-b+Math.sqrt(delta))/(2*a));
array[1]=((-b-Math.sqrt(delta))/(2*a));
System.out.println("roots are "+array[0]+","+array[1]);

}

public static double windchill(double velocity, double tem)
{
double temp=(((0.4275*tem)-35.75)*(Math.pow(velocity, 0.16)));
double value=(35.74+(0.6215*tem)+temp);
return value;
}
public String swap(String a, int i, int j)
{
    char temp;
    char[] charArray = a.toCharArray();
    temp = charArray[i] ;
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
}
public void permute(String str, int l, int r)
{
    if (l == r)
        System.out.println(str);
    else
    {
        for (int i = l; i <= r; i++)
        {
            str = swap(str,l,i);
            permute(str, l+1, r);
            str = swap(str,l,i);
        }
    }
}
//Take 1D Array Input
	public int[] input1DArray(int arraySize){
		int array[]=new int[arraySize];
		for(int i=0;i<arraySize;i++){
			System.out.println("Enter array["+i+"] : ");
			array[i]=Utility.inputInt();
		}
		return array;
	}
	//Print 1D array
		public void print1DArray(int array[]){
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
		}
//Take 1D String Array Input
	public String[] input1DStringArray(int arraySize){
		String array[]=new String[arraySize];
		for(int i=0;i<arraySize;i++){
			System.out.println("Enter array["+i+"] : ");
			array[i]=Utility.inputString();
		}
		return array;
	}
//print 1D array String
	public void print1DStringArray(String array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
/*stop watch
 * 
 */
//to start timer
	public long startTimer()
	
	{
		long start=System.currentTimeMillis();
		System.out.println("Start Time is: "+start);
		return start;
	}
	
	public long stopTimer()
	{
		long stop=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stop);
		return stop;
	}
	
	public long elapsedTime(long start,long stop)
	{
		long elapsed=stop-start;
		return elapsed/1000;
	}
/* Start of Algorithm programs*/
//
//
//
public static void anagramDetection(String string1,String string2)
{
	String s1=string1.replaceAll("\\s", "");
	String s2=string2.replaceAll("\\s", "");
	boolean status = true;  
    if (s1.length() != s2.length()) 
    {  
        status = false;  
    } else {  
        char[] ArrayS1 = s1.toLowerCase().toCharArray();  
        char[] ArrayS2 = s2.toLowerCase().toCharArray();  
        Arrays.sort(ArrayS1);  
        Arrays.sort(ArrayS2);  
        status = Arrays.equals(ArrayS1, ArrayS2);  
    }  
    if (status) {  
        System.out.println(s1 + " and " + s2 + " are anagrams");  
    } else {  
        System.out.println(s1 + " and " + s2 + " are not anagrams");  
    }  
}
/*public static int anagramPrimeDetection(int a[])
{
	
	boolean status;
	for(int i=0;i<a.length;i++)
	{
	char[] ArrayS1=(""+string1).toCharArray();
	char[] ArrayS2=(""+string2).toCharArray();
	
    if (ArrayS1.length != ArrayS2.length) 
    {  
        status = false;  
    } else {  
         
        Arrays.sort(ArrayS1);  
        Arrays.sort(ArrayS2);  
        status = Arrays.equals(ArrayS1, ArrayS2);  
    }  
    if (status) {  
        System.out.println(string1 + " and " + string2 + " are anagrams");  
    } else {  
        System.out.println(string1 + " and " + string2 + " are not anagrams");  
    }  
}*/
public ArrayList<Integer> primeNumberSearch(int l,int u)
{
	int n=5;
	int i;
	int j,flag=0,count=0;
	ArrayList<Integer> a = new ArrayList<Integer>(n);
	for(i=l;i<u;i++)
	{
		for(j=2;j<i;j++)
		{
		if(i%j==0)
		{
			flag=0;
			break;
			
		}
		else
		{
			flag=1;
			
		}
		
		}
		if(flag==1)
		{
			
			System.out.println(i);
			
			a.add(i);
			
			
		}
		
		
	}
	return a;
	

	
	
	
	
}
//Binary Search

	/*int binarySearch(int[] inputArr, int key) {
      int start = 0;
      int end = inputArr.length - 1;
      while (start <= end) {
          int mid = (start + end) / 2;
          if (key == inputArr[mid]) {
              return mid;
          }
          if (key < inputArr[mid]) {
             	end = mid - 1;
          } else {
             	start = mid + 1;
          }
      }
      return -1;
 	 }
	/*binary search for string
	 * 
	 */
	public int binarySearchString(String[] names, String key)
	{
    	int first = 0;
    	int last  = names.length;
 
    	while (first < last) {
        	int mid = (first + last) / 2;
        	if (key.compareTo(names[mid]) < 0) {
           			last = mid;
        	} else if (key.compareTo(names[mid]) > 0) {
            		first = mid + 1;
        	} else {
            		return mid;
        	}
    	}		
    	return -1;
	}
	/*insertion sort
	 * 
	 */
	public void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    
	//Insertion sort for String
	public String[] insertionSortString(String words[]){
			String temp;
			for(int i=1;i<words.length;i++){
				for(int j=i;j>0;j--){
					if(words[j].compareTo(words[j-1])<0){
						temp=words[j];
						words[j]=words[j-1];
						words[j-1]=temp;
					}
					else
						break;
				}
			}
			return words;
		}
		
	public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i] + " ");
 
        System.out.println();
    }
	public void printStringArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i] + " ");
 
        System.out.println();
    }
	/*bubble sort
	 * 
	 */
	public int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
}
	
		//Bubble Sort for String
		public String[] bubbleSortString(String numbers[])
	   	 {
	        String temp;
	        for(int i = 0; i < numbers.length; i++)
	       	{
	            for(int j = 1; j < (numbers.length -i); j++)
	            {
	            	//if numbers[j-1] > numbers[j], swap the elements
	        		if(numbers[j-1].compareTo(numbers[j])<0)
	    			{
	    				temp = numbers[j-1];
	   					numbers[j-1]=numbers[j];
	    				numbers[j]=temp;
	    			}
	   		 	}
	    	}
			return numbers;
		}
		
		 public void merge(String stringarray[], int start, int mid, int end) {
				int length1 = mid - start + 1;
				int length2 = end - mid;
				String[] left = new String[length1];
				String[] right = new String[length2];
				for (int i = 0; i < length1; i++) {
					left[i] = stringarray[i + start];

				}
				for (int i = 0; i < length2; i++) {
					right[i] = stringarray[i + mid + 1];

				}
				int i = 0, j = 0;
				int k = start;
				while (i < length1 && j < length2) {
					if (left[i].compareTo(right[j]) <= 0) {
						stringarray[k] = left[i];
						i++;
					} else {
						stringarray[k] = right[j];
						j++;
					}
					k++;
				}
				while (i < length1) {
					stringarray[k] = left[i];
					k++;
					i++;
				}
				while (j < length2) {
					stringarray[k] = right[j];
					k++;
					j++;
				}

			}

			public void printArray(String[] stringarray) {
				int n = stringarray.length;
				for (int i = 0; i < n; ++i)
					System.out.print(stringarray[i] + " ");

			}

			/**
			 * Sorting of two String arrays using mergesort
			 * 
			 * @param stringarray
			 * @param start
			 * @param end
			 */
			public void mergeSort(String stringarray[], int start, int end) {
				while (start < end) {
					int mid = ((start + end) / 2);
					mergeSort(stringarray, start, mid);
					mergeSort(stringarray, mid + 1, end);
					merge(stringarray, start, mid, end);
				}
			}
		 

			  	// Function for Calculating the notes
			  	public int calculate(int money,int[]notes)
			  	{
			  		int i=0;
				  	int total=0;
				  	
			  		//calling calculate Function
			        int rem;
					if(money==0)
					{
						return -1 ;
					}
					else
					{
						if(money>=notes[i])
						{
							// logic for Calculating The notes
							int calNotes =money/notes[i];
							rem = money%notes[i];
							money =rem;
							total += calNotes;
							System.out.println(notes[i]+   " Notes ---> " +calNotes );
						}
						i++;
						return calculate(money,notes);
					}
		 }
			  	public int search(int lo, int hi) {
			        if ((hi - lo) == 1) return lo;
			        int mid = lo + (hi - lo) / 2;
			        System.out.println("Is it less than %d?  "+ mid);
			        Scanner n = new Scanner(System.in);
			        boolean bn = n.nextBoolean();
			        if (bn==true) return search(lo, mid);
			        else                     return search(mid, hi);
			    }

		  	
			  	
			  	public void dayOfWeek()
			  	{
			  		boolean keepGoing = true;

			  	     while(keepGoing) {
			  	       System.out.println("Month");
			  	       int m=Utility.inputInt();
			  	     if (m < 1 || m > 12) {
			             System.out.println("Months are between 1 and 12");
			             continue;
			           }

			         System.out.println("Day");
			         int d=Utility.inputInt();
			         if (d < 1 || d > 31) {
			             System.out.println("Days are between 1 and 31");
			             continue;
			         }
			             System.out.println("Year");
			             int y = Utility.inputInt();
			               if (y < -10000 || y > 10000) {
			                  System.out.println("Years are between -10000 and 10000");
			                  continue;
			               }
			               
			               int y0 = y - (14 - m) / 12;
			               int x = y0 + y0/4 - y0/100 +y0/400;
			               int m0 = m + 12 * ((14 - m) / 12) - 2;
			               int d0 = (d + x + 31 * m0 / 12) % 7;
			               
			               
			               if (d0==0) {
			                   String b = "Sunday";
			                   System.out.println("The day of the week is " + b);
			                 } else {
			                   if (d0==1) {
			                     String b = "Monday";
			                     System.out.println("The day of the week is " + b);
			                   } else {
			                     if (d0==2) {
			                       String b = "Tuesday";
			                       System.out.println("The day of the week is " + b);
			                   } else {
			                     if (d0==3) {
			                       String b = "Wednesday";
			                       System.out.println("The day of the week is " + b);
			                     } else {
			                       if (d0==4) {
			                         String b = "Thursday";
			                         System.out.println("The day of the week is " + b);
			                       } else {
			                         if (d0==5) {
			                           String b = "Friday";
			                           System.out.println("The day of the week is " + b);
			                         } else {
			                           if (d0==6) {
			                             String b = "Saturday";
			                             System.out.println("The day of the week is " + b);
			                           }                 
			                          }
			                         }
			                      }
			                    }
			                    }
			                 } 

			               
			           }
			  	   
			          }
			  	public void temperaturConversion(double temperature,boolean temp) {
			  		if(temp == true) {
			  			double f= (temperature*(9.0/5))+32;
			  			System.out.println("temperature in fahrenheit is "+f);
			  		}
			  			else {
			  				double c=(temperature-32)*(5.0/9);
			  				System.out.println("temperature in centigrade is "+c);
			  			}
			  		}
			  	public double sqrt(double c)
			  	{
			  		double epsilon=1e-15;
			  		double t=c;
			  		while (Math.abs(t - c/t) > epsilon*t) {
			            t = (c/t + t) / 2.0;
			        }
					return t;
			  	}
			  	
			  	public void toBinary(int input)
			  	{
			  		if (input > 1)
						toBinary(input / 2);
					System.out.print(input % 2 + " ");

			  	}
			  	public void swapNibbles(int x)
			  	{
			  		System.out.println((x & 0x0F) << 4 | (x & 0xF0) >> 4);
			  	}
			  	
			  	public double monthlypayment(double P,double Y,double R)
			  	{
			  		double n=12*Y;
			  		double r=R/(12*100);
			  		double payment;
			  		double x=1+r;
			  		double y=Math.pow(x, -n);
			  		double z=1-y;
			  		payment=P*r/z;
			  		return payment;
			  	}
				/*public int binarySearch(String[] a, int key) {
					int start = 0;
				      int end = a.length - 1;
				      while (start <= end) {
				          int mid = (start + end) / 2;
				          if (key == a[mid]) {
				              return mid;
				          }
				          if (key < a[mid]) {
				             	end = mid - 1;
				          } else {
				             	start = mid + 1;
				          }
				      }
				      return -1;
				
				
				}
				public boolean balanceChecker(char[] inputArray)
				{
					Stack<Character> st=new Stack<Character>();
				
					for(int i=0;i<inputArray.length;i++)
					{
						if(inputArray[i]=='(')
							
					}
				}*/

/*public int binarySearchString(String[] names,String key)
{
	int first = 0;
	int last  = names.length;

	while (first < last) {
    	int mid = (first + last) / 2;
    	if (key.compareTo(names[mid]) < 0) {
       			last = mid;
    	} else if (key.compareTo(names[mid]) > 0) {
        		first = mid + 1;
    	} else {
        		return mid;
    	}
	}		
	return -1;
	
}*/
public int dayWeek(int month, int day, int year) {
	int y0, x, m0, d0;
	y0 = year - (14 - month) / 12;
	x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
	m0 = month + 12 * ((14 - month) / 12) - 2;
	d0 = (day + x + 31 * m0 / 12) % 7;
	return d0;
	
}
public ArrayList<Integer> primesList(int input) {
	int i;
	ArrayList<Integer>array=new ArrayList<Integer>();
	for (i = 2; i <= input; i++) {
		if (checkPrime(i))
			array.add(i);
		else
			continue;

	}
	return array;
}	
public boolean checkPrime(int current) {
	for (int i = 2; i <= Math.sqrt(current); i++) {
		if (current % i == 0)
			return false;
	}
	return true;
}

public boolean checkAnagram(String string1, String string2) {
	boolean bool;
	string1 = string1.replaceAll("\\s+", "");
	string1 = string1.toLowerCase();
	string2 = string2.replaceAll("\\s+", "");
	string2 = string2.toLowerCase();
	if (string1.length() == string2.length()) {
		char[] string1array = string1.toCharArray();
		char[] string2array = string2.toCharArray();
		Arrays.sort(string1array);
		Arrays.sort(string2array);

		bool = Arrays.equals(string1array, string2array);
		return bool;
	} else
		return false;
}
public int getDay(int date, int month, int year) {
	
	int y = year - (14-month)/12;
	int x = y + y/4 - y/100 + y/400;
	int m = month + 12*((14-month)/12) - 2;
	int d = (date + x + (31*m)/12)%7;
	return d;
	
}
public int fun(Iterator itr11,Iterator<Entry> itr1,int amnt,int price,String wt)
{
		while (itr11.hasNext()) 
	     {
	         itr1 = ((Map) itr11.next()).entrySet().iterator();
	
	         int a=0;
       while (itr1.hasNext()) {
           Map.Entry pair = itr1.next();
           if((pair.getKey()).equals("Weight"))
           {
           	wt=(String) pair.getValue();
           	
           }
          
           if((pair.getKey()).equals("priceperkg"))
           {
           	String val=(String) pair.getValue();
           
           	 a=Integer.parseInt(val);
           	
           	
           }
       	int w=Integer.parseInt(wt);
       	int b=w*a;
  
      
      	amnt=amnt+b;
    	
           System.out.println(pair.getKey() + " : " + pair.getValue());
          
       }
       System.out.println("Amount till now " +amnt);
	     }
		return amnt;
}
public static StringBuilder createJsonfromArray(Collection products) {
	StringBuilder jsonstring = new StringBuilder();
	jsonstring.append('[');
	Iterator iterator = products.iterator();
	while (iterator.hasNext()) {

		jsonstring.append(iterator.next());
		if (iterator.hasNext()) {
			jsonstring.append(",");
		}
		

	}
	jsonstring.append("]");
	return jsonstring;

}
public void cards(int cnt, String cards[], ArrayList<String> per)
{
	 while(cnt<9)
		{
			int value=(int) ( Math.random() *52);
			if(cards[value]!=null)
			{
				per.add(cards[value]);
				cards[value]=null;
				cnt++;
			}
			
		}
}
public void fill(int i,String rslt[][], ArrayList<String> per)
{
	 for(int j=0;j<9;j++)
		{
			String st=per.get(j);
			rslt[i][j]=st;
		}
}
//Function take String in dd/mm/yyyy format and return Date Object
	public Date printDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try{
			return sdf.parse(date);
		}
		catch(ParseException pe){
			return null;
		}
	}

}
			  	
			  	
			  	






