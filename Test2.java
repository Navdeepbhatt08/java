class Test1
{
    public void printname()
    {
        System.out.print("This is parent class name ");
    }
//implementation of Overloading
public int sum(int a , int b)
{
    return a+b;
}
public int sum(int a , int b , int c)
{
    return a+b+c;
}
}

class test3 extends Test1
{
//Overriding the method of parent class
    public void printname()
    {
        System.out.println("This is child class name");
    }
}

public class Test2
{
    public static void main(String [] s)

    {
        //Obverriding
        test3 ob = new test3();
        ob.printname();


        //Implement Overloading

        Test1 ob1 = new Test1();
       
       System.out.println(ob1.sum(10,20,30)); 
       System.out.println(ob1.sum(20,30)); 
    }
}