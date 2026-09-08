import java.io.*;

interface Inf1
{
	int a=10;
	public void show();
	

	public void mesg();
	
}

class B implements Inf1
{
	public void fun()
	{
		System.out.print("\n\n\tconcrete fun() of class B");
	}
	
	public void show()
	{
		System.out.print("\n\n\toverride show() of class B and a : "+a);
		
		
	}
	public void mesg()
	{
		System.out.print("\n\n\toverride mesg of class B");
	}
	
}



class A2
{
	public static void main(String s[])
	{
		B b1=new B();
		b1.show();
		b1.mesg();
		b1.fun();
		System.out.print("\n\n\ta : "+Inf1.a);
	}
}
