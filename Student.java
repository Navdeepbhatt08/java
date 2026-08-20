class Student
{
    String name ;
    int age;

    Student()
    {
        name = "Navdeep";
        age = 22;
    }
    Student(String name)
    {
        this.name = name;
        age = 18;
    }
    Student(String name , int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }


    public static void main(String[] args)
    {
       Student s1 = new Student();
       Student s2 = new Student("Navdeep");
       Student s3 = new Student("Navdeep",21);

       s1.display();
       s2.display();
       s3.display();
    }
}