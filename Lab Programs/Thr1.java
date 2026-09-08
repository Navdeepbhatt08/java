import java.io.*;

class Test extends Thread
{
	int i;
	Test(String a,int p)
	{
		setName(a);
		setPriority(p);
		start();
	}	
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			System.out.print("\n\tin "+Thread.currentThread()+" i : "+i);
			try
			{
				//Thread.sleep(500);
			}
			catch(Exception ex)
			{}
		}
	}
}


class Thr1
{
	
	public static void main(String s[])
	{
		int j;
		Test t1=new Test("Sec-G1",1);
		Test t2=new Test("Sec-G2",10);
		//t1.start();c
		for(j=1;j<=10;j++)
		{
			System.out.print("\n\tin "+Thread.currentThread()+" j : "+j);
			try
			{
				//Thread.sleep(500);
			}
			catch(Exception ex)
			{}
			if(j==5)
			{
				try
				{
					t1.join();
					t2.join();	
				}
				catch(Exception ex)
				{}
			}
		}
	}	
}

