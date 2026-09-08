import java.io.*;
class Excep4
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
		catch(Exception ex)
		{
			System.out.println("\n\t\tException occured : "+ex);
		}
		
		System.out.println("\n\n\tRest of the code is executing");
	}
}