import java.io.*;
class Myexcep extends Throwable
{
	String ee="";	
	Myexcep(String str)
	{
		ee=str;	
	}		
	
	public String toString()
	{
		return(ee);
	}
	public void showerror()
	{
		System.out.print("\n\n\terror found : "+ee);
	}
}

class Excep6
{
	public static void main(String s[])
	{
		int mo,mm,p;
		try
		{
			mo=Integer.parseInt(s[0]);
			System.out.println("\n\tmarks obtained is okay");
			mm=Integer.parseInt(s[1]);
			if(mo>mm)
			{
				throw(new Myexcep("Marks obtained cannot exceed max marks"));			
			}
			if(mo<0)
			{
				throw(new Myexcep("Marks obtained cannot be negative"));			
			}
			System.out.println("\n\tMaximum marks is okay");
			p=(mo*100)/mm;
			System.out.println("\n\n\tpercentage : "+p);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("\n\t\tplease provide atleastb two numbers");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("\n\t\tplease input valid numnbers only");
		}	
		catch(ArithmeticException ex)
		{
			System.out.println("\n\t\tmaximuj marks cannotb be zero");
		}
		catch(Myexcep ex)
		{
			//ex.showerror();
			System.out.println("\n\t\texception occured : "+ex);
		}
		System.out.println("\n\n\tRest of the code is executing");
	}
}