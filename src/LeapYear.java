import com.jda.utility.Utility;

public class LeapYear {
public static void leapyear(int year)
{
	if ((year%400==0)||((year%4==0)&&(year%100!=0)))
	{
		System.out.println("its a leap year");
	}
		else 
		{
		System.out.println("not a leap year");	
		}
}
}
public static void main(String args[])
{
Utility year=new Utility();

	}
