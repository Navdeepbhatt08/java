import java.io.*;
import java.util.*;

class Queue
{
	private int que[]=new int[5];
	private int rear=-1;
	private int front=-1;

	public void insert(int a)
	{
		if(rear==4)
		{
			System.out.print("\n\n\t\tQueue is full");
		}
		else
		{
			
			rear++;
			que[rear]=a;
			if(front==-1)
			{
				front++;
			}
		}
	}

	public void del()
	{
		if(rear==-1)
		{
			System.out.print("\n\n\t\tQueue is empty");
		}
		else if(front==rear)
		{
			System.out.print("\n\n\t\tdeleted data : "+que[front]);	
			front=rear=-1;
		}
		else
		{
			System.out.print("\n\n\t\tdeleted data : "+que[front]);
			front++;
		}
	}
	
	

	public void disp()
	{
		if(rear==-1)
		{
			System.out.print("\n\n\t\tQueue is empty");
		}
		else
		{
			System.out.print("\n\n\t\t");
			for(int i=front;i<=rear;i++)
			{
				System.out.print(que[i]+"   ");
			}
			
		}
	}
}


class quetest
{
	public static void main(String s[])
	{
		Queue q1,q2;
		q1=new Queue();
		q2=new Queue();
		int ch,a;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("\n\n\t1. Insert I Queue\n\t2. Insert II Queue\n\t3. Delete I Queue\n\t4. Delete II Queue\n\t5. Diaply I Queue\n\t6. Display II Queue\n\t7. Exit\n\n\tEnter your choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.print("\n\tenter data to insert : ");
				a=sc.nextInt();
				q1.insert(a);
				break;
			
				case 2:
				System.out.print("\n\tenter data to insert : ");
				a=sc.nextInt();
				q2.insert(a);
				break;
				
				case 3:
				q1.del();
				break;
	
				case 4:
				q2.del();
				break;
				
				case 5:
				q1.disp();
				break;

				case 6:
				q2.disp();
				break;

				case 7:
				System.exit(0);
		
				default:
				System.out.print("\n\n\tInvalid choice");
				break;				
			}
		} 	
	}	
}



