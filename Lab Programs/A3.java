import java.io.*;
import mypack.*;
import mypack.subpack.*;

class A3
{
	public static void main(String s[])
	{
		Car c1=new Car("Honda","City");
		c1.show();
		Bike b1=new Bike("Triumph","Bobber",1400000);
		b1.show();
		Calc c2=new Calc();
		c2.sum(10,20);
		c2.mul(3,5);
	}
}