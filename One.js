class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    introduce() {
        console.log(`My name is ${this.name} and I am ${this.age} years old.`);
    }
}

class Student extends Person {
    constructor(name, age, rollNo) {
        super(name, age); 
        this.rollNo = rollNo;
    }

    study() {
        console.log(`${this.name} is studying.`);
    }

    display() {
        console.log("Roll Number:", this.rollNo);
    }
}

const student = new Student("Navdeep", 22, 101);

student.introduce(); // Inherited
student.study();     // Child method
student.display();   // Child method