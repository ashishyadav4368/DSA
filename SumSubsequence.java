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
