import java.util.Scanner;

public class ReverseArrayRecursion {

    static void reverse(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // recursive call
        reverse(arr, start + 1, end - 1);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array ");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter " + n + " values ");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            reverse(arr, 0, n - 1);
            System.out.println("Reversed Array :");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
