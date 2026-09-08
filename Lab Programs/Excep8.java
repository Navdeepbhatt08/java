import java.io.*;
import java.util.*;

class Myexcep extends Throwable
{
	String err;
	Myexcep(String str)
	{
		err=str;	
	}
	
	public String toString()
	{
		return(err);
	}
	
	public void showerror()
	{
		System.out.print("\n\n\t"+err);
	}
}

class Excep8
{
	public static void main(String s[])
	{
		int mo,mm,p;
		Scanner sc;
		try
		{
			sc=new Scanner(System.in);
			System.out.println("\n\tenter marks obtained : ");
			mo=sc.nextInt();
			System.out.println("\n\tenter max marks : ");
			mm=sc.nextInt();
			if(mo>mm)
			{
				throw(new Myexcep("marks ob cannot exceed max marks"));
			}
			if(mo<0)
			{
				throw(new Myexcep("marks ob cannot be negative"));
			}
			p=(mo*100)/mm;
			System.out.println("\n\n\tpercentage : "+p);
		}
		catch(InputMismatchException ex)
		{
			System.out.println("\n\t\tplease input valid numnbers only");
		}	
		catch(ArithmeticException ex)
		{
			System.out.println("\n\t\tmaximuj marks cannotb be zero");
		}
		catch(Myexcep ex)
		{
			System.out.println("\n\t\texception found : "+ex);
			//ex.showerror();
		}
		
		System.out.println("\n\n\tRest of the code is executing");
	}
}