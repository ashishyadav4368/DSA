import java.util.Scanner;

public class Factorial {
    static int Fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * Fact(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n ");
            int n = sc.nextInt();
            System.out.println(Fact(n));
        }
    }
}

// in this program we have taken two variables to swap the elements of array but
// we can do same thing by using single variable , (i , n-i-1)

// import java.util.Scanner;

// public class ReverseArrayOneVar {

// static void reverse(int arr[], int i, int n) {
// // base case
// if (i >= n / 2) {
// return;
// }

// // swap arr[i] and arr[n-i-1]
// int temp = arr[i];
// arr[i] = arr[n - i - 1];
// arr[n - i - 1] = temp;

// // recursive call with next index
// reverse(arr, i + 1, n);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Input array size
// System.out.println("Enter size of array:");
// int n = sc.nextInt();

// int arr[] = new int[n];
// System.out.println("Enter " + n + " elements:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// // reverse using recursion
// reverse(arr, 0, n);

// // print reversed array
// System.out.println("Reversed Array:");
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }
