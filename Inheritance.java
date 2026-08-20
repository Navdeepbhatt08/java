class Animal {
    public void sayHello() {
        System.out.println("This is the parent Animal class");
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sayHello();
        d.bark();
    }
}