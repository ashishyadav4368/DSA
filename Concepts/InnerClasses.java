package Concepts;

// public class InnerClasses {
//     static class Test {
//         String name;

//         public Test(String name) {
//             this.name = name;
//         }
//     }

//     public static void main(String[] args) {
//         // Test a = new Test("Ashish Yadav"); // we can't do this untill the class Test
//         // will be static, bcz non- static
//         // // can't be accessed in a static method
//         // Test b = new Test("Anshu Yadav");

//         // now change the class Test To static and then run

//         Test a = new Test("Ashish Yadav");
//         Test b = new Test("Anshu Yadav");

//         System.out.println(a.name);
//         System.out.println(b.name);

//     }
// }

//till here everything is fine but , now if we take the class Test and make it a outer class then see what happens
class Test {
    static String name; // yaha agar static laga ke rkhenge to output same aayega Anshu yadav, aur agar
                        // static hata diya to output Ashish yadav , asnhu yadav aayega

    public Test(String name) {
        this.name = name;
    }
}

public class InnerClasses {

    public static void main(String[] args) {
        // Test a = new Test("Ashish Yadav"); // we can't do this untill the class Test
        // will be static, bcz non- static
        // // can't be accessed in a static method
        // Test b = new Test("Anshu Yadav");

        // now change the class Test To static and then run

        Test a = new Test("Ashish Yadav");
        Test b = new Test("Anshu Yadav");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}

// Key Concept:static variables

// static means the variable belongs to the class, not to any particular object.

// So there is only one copy of name in memory, shared by all Test objects.

// Step-by-
// Step Execution

// Test a = new Test("Ashish Yadav");

// The constructor sets this.name="Ashish Yadav";.

// But name is static,
// so it
// updates the
// single shared variable.

// Now:Test.name="Ashish Yadav";.

// Test b = new Test("Anshu Yadav");

// Constructor runs
// again and
// sets the
// same shared name.

// Now:Test.name="Anshu Yadav";.

// System.out.println(a.name);

// Prints"Anshu Yadav"(the latest value).

// System.out.println(b.name);

// Also prints"Anshu Yadav"(same shared variable)
