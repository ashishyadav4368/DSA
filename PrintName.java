import java.util.Scanner;

// public class PrintName {

//     static void printName(String name, int n) {
//         if (n == 0) { // base case
//             return;
//         }
//         System.out.println(name);
//         printName(name, n - 1); // decrease n each time
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name: ");
//         String name = sc.nextLine();
//         System.out.println("Enter how many times you want to print: ");
//         int n = sc.nextInt();

//         printName(name, n);
//     }
// }

public class PrintName {
    static void printName(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Ashish");
        printName(i + 1, n);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n ");
            int n = sc.nextInt();
            printName(1, n);
        }
    }
}