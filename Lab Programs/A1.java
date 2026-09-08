import java.io.*;

interface Inf1
{
	int a=10;
	public void fun1();
	

	public void fun2();
	
}



abstract class A
{
	A()
	{
		System.out.print("\n\n\tdeafult constructor of class A");
	}
	public void show()
	{
		System.out.print("\n\n\tconcrete show() of class A");
	}

	abstract public void mesg();
	
	
}

class B extends A implements Inf1
{
	public void showB()
	{
		System.out.print("\n\n\tconcrete show() of class A");
	}
	
	public void mesg()
	{
		System.out.print("\n\n\toverride mesg of class B");
	}
	public void fun1()
	{
		System.out.print("\n\n\toverride fun1 of class B");
	}
	public void fun2()
	{
		System.out.print("\n\n\toverride fun2 of class B");
	}

}



class A1
{
	public static void main(String s[])
	{
		B ob=new B();
		ob.show();
		ob.mesg();
		ob.showB();
	}
}
