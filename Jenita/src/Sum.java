/*JENITAMARY
05-08-2017*/
import java.util.Scanner;
public class Sum
{
	public static boolean valueorsum10(int a,int b)
		{
			if (a==10 && b!=10||a!=10 && b==10|| a + b==10)
			{
				
				System.out.println("True");
				return true;
			}
			else 
			{
				System.out.println("False");
				return false;
			}
		}
	public static void main(String args[])
	{
		//test1
		int a=5;
		int b=9;
		boolean expectedvalue= false;
		boolean actualvalue= Sum.valueorsum10(a,b);
	
		if(actualvalue==expectedvalue)
		{
			System.out.println("Test Passes");
		}
		else
		{
			System.out.println("Test Fails");
		}
	}

}
