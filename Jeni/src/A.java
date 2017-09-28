import java.util.Scanner;
class Adder
{
   public  void addOne(int a)
   {
   	System.out.println(++a);
   }

    
}
public class A extends Adder 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a no:");
		int a=sn.nextInt();
		Adder x=new Adder();
		//A x1=new A();
		x.addOne(a);
		
	}

}
