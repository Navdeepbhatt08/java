import java.io.*;
import java.util.*;


class Stack
{
	int s[]=new int[5];
	int top;	
	
	Stack()
	{
		top=-1;
	}	
	public void push(int x)
	{
		if(top==4)
		{
			System.out.print("\n\t\tstack is overflow");
			
		}
		else
		{
			top++;
			s[top]=x;
		}
	}
	
	public void pop()
	{
		if(top==-1)
		{
			System.out.print("\n\t\tstack is underflow");
			
		}
		else
		{
			System.out.print("\n\t\tpopped data : "+s[top]);
			top--;
		}
	}

	public void disp()
	{
		if(top==-1)
		{
			System.out.print("\n\t\tstack is underflow");
			
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.print("\n\t"+s[i]);
			}
		}
		
	}

}



class test1
{
	public static void main(String s[])
	{
		Scanner sc;
		int ch,a;
		Stack s1,s2;
		s1=new Stack();
		s2=new Stack();
		sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("\n\t1. Push I Stack\n\t2. Push II Stack\n\t3. Pop I Stack\n\t4. Pop II Stack\n\t5. Display I Stack\n\t6. Display II Stack\n\t7. Exit\n\n\tEnter your choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.print("\n\tenter data to push : ");
				a=sc.nextInt();
				s1.push(a);
				break;
				
				case 2:
				System.out.print("\n\tenter data to push : ");
				a=sc.nextInt();
				s2.push(a);
				break;

				case 3:
				s1.pop();
				break;


				case 4:
				s2.pop();
				break;

				case 5:
				s1.disp();
				break;

				case 6:
				s1.disp();
				break;

				case 7:
				System.exit(0);
				break;

				default:
				System.out.print("\n\tInvalid choice");
				break;
			}
		}	
	}
}
