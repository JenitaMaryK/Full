/*JENITAMARY
05-08-2017*/
import java.util.Scanner;

public class CallFn
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter 2 values:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		Sum sm=new Sum();
		sm.valueorsum10(a,b);
	}

}
