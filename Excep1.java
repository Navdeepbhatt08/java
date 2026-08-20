public class Excep1
{
    public static void main(String[] args)
{
    try
    {
        System.out.print(10/0);
    }
    catch(Exception e)
    {
        System.out.print("Exception Occured : "+e);
    }
}}