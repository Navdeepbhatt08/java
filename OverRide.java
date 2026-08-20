class Animal {
    public void sound()
    {
        System.out.println("All Animals Have some sounds ");
    }
}
class Dog extends Animal {
    public void sound()
    {
        System.out.println("Dog Bark");
    }
}

public class OverRide
{
    public static void main(String[] args)
    {

        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();
        
    }
}