import java.io.*;
import java.util.*;

class Stud
{
	private String nm,sub;
	private int roll,mo,mm;
	
	Stud()
	{
		System.out.print("\n\tdefault constructor called");
		mm=100;;
	}
	
	Stud(String nm,String sub,int roll,int d)
	{
		System.out.print("\n\tArgument constructor called");
		this.nm=nm;
		this.sub=sub;
		this.roll=roll;
		mo=d;
		mm=100;
	}
	
	Stud(String a,String b)
	{
		System.out.print("\n\tArgument-2 constructor called");
		nm=a;
		sub=b;
		mm=100;
	}	
	
	Stud(Stud ob,String b)
	{
		System.out.print("\n\tCopy constructor called");
		nm=ob.nm;
		sub=b;
		roll=ob.roll;
		mo=ob.mo;
		mm=100;
	}

	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\tenter name,subject, roll no and marks : ");
		nm=sc.nextLine();
		sub=sc.next();
		roll=sc.nextInt();
		mo=sc.nextInt();
		
	}
	
	public void showdata()
	{
		System.out.print("\n\n\t"+nm+"\t"+sub+"\t"+roll+"\t"+mo+"\t"+mm);
	}
}

class Studtest1
{
	public static void main(String s[])
	{
		Stud s1,s2;
		s1=new Stud("Amit","arts",44,65);	
		s2=new Stud("Ashish","mech",54,79);	
		s1.showdata();
		s2.showdata();
		
		
		
	}	
	
}




