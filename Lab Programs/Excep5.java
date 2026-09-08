import java.io.*;
import java.util.*;
class Testexcep1
{
	Scanner sc;
	public void calcper() throws 	InputMismatchException,ArithmeticException 
	{
		int mm,mo,p;
		sc=new Scanner(System.in);
		System.out.print("\n\tenter marks obtained and max marks : ");
		mo=sc.nextInt();
		mm=sc.nextInt();
		p=(mo*100)/mm;
		System.out.print("\n\n\tpercetage : "+p);
	}
}


public class Excep5
{
	public static void main(String s[])
	{
		Testexcep1 t1=new Testexcep1();
		try
		{
			t1.calcper();
		}
		catch(InputMismatchException ex)
		{
			System.out.print("\n\n\tplease input valid marks ob and max marks");
		}
		catch(ArithmeticException ex)
		{
			System.out.print("\n\n\tmax marks cannot be zero");
		}
		System.out.println("\n\n\trest of the code is executing");
	}
}