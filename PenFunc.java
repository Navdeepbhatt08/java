class pen 
{
    String color;
    String type;

    public void write()
    {
        System.out.println("Writing Something");
    }
}

public class PenFunc{
    public static void main(String args[])
    {
        pen obj = new pen();
        obj.color = "Red";
        obj.type = "Gel";
       
       obj.write();
    }
}