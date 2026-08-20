class Person {
    String name;
    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNumber;

    void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Inherit {
    public static void main(String[] args) {

        // Creating object of Student
        Student obj = new Student();
        Student obj2 = new Student();

        // Accessing inherited field
        obj.name = "Navdeep";

        // Accessing Student field
        obj.rollNumber = 101;
        obj2.rollNumber = 102;

        // Calling methods
        obj.displayName();
        obj.displayStudent();
        obj2.displayStudent()
    }
}