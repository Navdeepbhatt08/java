import java.io.*;
class Excep1
{
	public static void main(String s[])
	{
		int mo,mm,p;
		try
		{
			mo=Integer.parseInt(s[0]);
			System.out.println("\n\tmarks obtained is okay");
			mm=Integer.parseInt(s[1]);
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
		
		System.out.println("\n\n\tRest of the code is executing");
	}
}