class Student {
    String name;
    int age;
    int rollno;
    String college;
}

public class studentRecord {
    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();

        s1.name = "Navdeep";
        s1.age = 28;
        s1.rollno = 22;
        s1.college = "GEU DDN";

        // Creating second object
        Student s2 = new Student();

        s2.name = "Rahul";
        s2.age = 28;
        s2.rollno = 23;
        s2.college = "GEU DDN";

        // Printing details
        System.out.println("Student 1");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        System.out.println();

        System.out.println("Student 2");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
    }
}