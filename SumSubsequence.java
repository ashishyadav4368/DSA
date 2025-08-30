import java.util.*;

public class SumSubsequence {

    static void print(int[] arr, int index, List<Integer> current, int sum, int k) {
        if (index == arr.length) {
            if (sum == k) {
                System.out.println(current);
            }
            return;
        }

        // include current element
        current.add(arr[index]);
        print(arr, index + 1, current, sum + arr[index], k);

        // exclude current element
        current.remove(current.size() - 1);
        print(arr, index + 1, current, sum, k);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Enter the value of k ");
        int kk = sc.nextInt();
        print(arr, 0, new ArrayList<>(), 0, kk);

    }
}

// this is the program where we will return the first subsequence when we get,
// we will not print all the subsequence but return only one

// import java.util.*;

// public class OneSubsequenceSumK {

// static boolean findSubsequence(int[] arr, int index, List<Integer> current,
// int sum, int k) {
// // base case
// if (index == arr.length) {
// if (sum == k) {
// System.out.println("One subsequence: " + current);
// return true; // ✅ found one, stop here
// }
// return false; // ❌ not valid, keep searching
// }

// // include arr[index]
// current.add(arr[index]);
// if (findSubsequence(arr, index + 1, current, sum + arr[index], k)) {
// return true; // 🚀 if found in this branch, stop searching
// }
// current.remove(current.size() - 1); // backtrack

// // exclude arr[index]
// if (findSubsequence(arr, index + 1, current, sum, k)) {
// return true;
// }

// return false; // neither include nor exclude worked
// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 1 };
// int k = 2;
// findSubsequence(arr, 0, new ArrayList<>(), 0, k);
// }
// }
