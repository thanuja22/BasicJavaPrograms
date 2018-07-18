package com.jda.utility;
import java.io.PrintWriter;
import java.util.Arrays;
/**
 * 
 */
import java.util.Scanner;

public class Utility {
	
		
	
	static Scanner scanner;
	
	
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
	public String inputString(){
		return scanner.nextLine();
		
	}
	/**
	 * method for leap year
	 * @return
	 */
	public int inputInt()
	{
		
		return scanner.nextInt();
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
	public static void leapYear(int year)
	{
		int var=year;
		if((var%400==0) ||((var%4==0)&&(var%100!=0)))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
		
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
public static int[] arrayInput(int N)
{
	int a[]=new int[N];
	for(int i=0;i<N;i++)
	{
		Scanner scan=new Scanner(System.in);
		a[i]=scan.nextInt();
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
public static void primeNumberSearch(int l,int u)
{
	int i,j,flag=0;
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
			System.out.println();
			System.out.println(i);
			
		}
	}
	
	
}
}




