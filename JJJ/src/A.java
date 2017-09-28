import java.util.Scanner;

public class A 
{
	 public static int addOne(int a)
	   {
	   	System.out.println(++a);
	   	return a;
	   }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Scanner sn=new Scanner(System.in);
		//System.out.println("Enter a no:");
		//int a=sn.nextInt();
		//Adder x=new Adder();
		//A x1=new A();
		//x1.addOne(9);
		
		int x=10;
		int y=0;
		 y=x+ (x>>1);
		System.out.println(x);
		System.out.println(y);
		String a=new String("h");
		System.out.println(a);
		StringBuffer o=new StringBuffer("hi");
		System.out.println(o.toString());
		System.out.println(a.toString());
		
	}

}
