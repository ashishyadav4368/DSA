import java.util.Scanner;

public class FunctionalRecursion {

    static int PrintSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + PrintSum(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner((System.in))) {
            System.out.println("Enter the value of N");
            int n = sc.nextInt();
            System.out.println(PrintSum(n));
        }
    }
}

// this is example of functional recursion , in which we are gonna print sum of
// first N numbers where we will be taking the value of N from the user
