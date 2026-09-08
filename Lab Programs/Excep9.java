import java.io.*;

class Myclass extends Throwable
{
	String err;
	Myclass(String a)
	{
		err=a;
	}	
	
	public String toString()
	{
		return(err);
	}
	public void showerror()
	{
		System.out.print("\n\t"+err);
	}
}

class Excep9
{
	public static void main(String s[])
	{
		int mo,mm,p;
		try
		{
			mo=Integer.parseInt(s[0]);
			mm=Integer.parseInt(s[1]);
			if(mo>mm)
			{
				throw(new Myclass("Marks Ob cannot exceed max Marks"));	
			}
			if(mo<0)
			{
				throw(new Myclass("Marks Ob cannot be neagative"));
			}
			p=(mo*100)/mm;
			System.out.print("\n\n\tpercentage : "+p+
"%");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.print("\n\n\tplease input at least two numbers");
		}
		catch(NumberFormatException ex)
		{
			System.out.print("\n\n\tplease input valid marks ob and max marks");
		}
		catch(ArithmeticException ex)
		{
			System.out.print("\n\n\tMax marks cannot be zero");
		}
		catch(Myclass ex)
		{
			//ex.showerror();
			System.out.print("\n\tException found : "+ex);
		}
	}
}
