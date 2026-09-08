import java.io.*;
class Excep2
{
	public static void main(String s[])
	{
		int mo=0,mm=0,p=0;
		try
		{
			mo=Integer.parseInt(s[0]);
			System.out.println("\n\tmarks obtained is okay");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("\n\t\tplease provide MO");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("\n\t\tplease input valid Marka obtained");
		}
		try
		{	
			mm=Integer.parseInt(s[1]);
			System.out.println("\n\tMaximum marks is okay");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("\n\t\tplease provide MM");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("\n\t\tplease input valid MaxMarks");
		}
		try
		{
			p=(mo*100)/mm;
			System.out.println("\n\n\tpercentage : "+p);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("\n\t\tmaximum marks cannotb be zero");
		}
		
		System.out.println("\n\n\tRest of the code is executing");
	}
}