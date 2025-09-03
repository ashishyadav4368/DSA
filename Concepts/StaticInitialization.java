package Concepts;

public class StaticInitialization {
    static int a = 5;
    static int b;
    // static block will run only once when the first object is created i:e when the
    // class is loaded
    static {
        System.out.println("Hey, I am static block");

        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInitialization obj1 = new StaticInitialization();
        System.out.println(StaticInitialization.a + "  " + StaticInitialization.b);

        StaticInitialization.b += 5;
        System.out.println(StaticInitialization.a + "  " + StaticInitialization.b);
        StaticInitialization obj2 = new StaticInitialization();
        System.out.println(StaticInitialization.a + "  " + StaticInitialization.b);

    }
}