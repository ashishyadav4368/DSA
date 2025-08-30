class Student {
    String name;
    int age;
    String course;

    // Constructor 1
    Student() {
        this("Unknown", 0); // calling Constructor 2
        System.out.println("Default constructor called");
    }

    // Constructor 2
    Student(String name, int age) {
        this(name, age, "Not Assigned"); // calling Constructor 3
        System.out.println("Constructor with 2 parameters called");
    }

    // Constructor 3
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Constructor with 3 parameters called");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        // 🔹 This will trigger all constructors in a chain
    }
}
