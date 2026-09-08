import java.io.*;

class TestThread extends Thread
{
	TestThread(String a)
	{
		setName(a);
		start();
	}	
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("\ti in "+Thread.currentThread()+"  "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ex)
			{}
		}
	}
}


class Th1 
{
	public static void main(String s[])
	{
		int j;
		TestThread t1=new TestThread("First");
		TestThread t2=new TestThread("Second");
		//t1.start();
		
		for(j=1;j<=10;j++)
		{
			System.out.println("\tj in "+Thread.currentThread()+"  "+j);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ex)
			{}
		}
		
		
		
		
		
	}
}