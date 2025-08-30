package Concepts;

class Student {
    String name; // instance variable (unique for each student)
    int rollNo; // instance variable
    static String college = "NIMS University"; // static variable (shared by all students)

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println(name + " | " + rollNo + " | " + college);
    }
}

public class TestStatic {
    public static void main(String[] args) {
        Student s1 = new Student("Ashish", 1);
        Student s2 = new Student("Ravi", 2);

        s1.display();
        s2.display();

        // Changing college name using class (no need of object)
        Student.college = "Delhi University";

        s1.display();
        s2.display();
    }
}
