class Names
{
    public void getName()
    {
        System.out.println("This is my Name ");
    }
}
class Course extends Names
{
    public void getName()
    {
        System.out.println("This is my Name from Course");
    }
}

public class Overriding{
public static void main(String[] args)
{
    Course c = new Course();
    c.getName();

}
}