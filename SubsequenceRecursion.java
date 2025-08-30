// import java.util.Scanner;

// public class SubsequenceRecursion {

//     static void subsequence(String str, int index, String current) {
//         if (index == str.length()) {
//             System.out.println(current);
//             return;
//         }
//         subsequence(str, index + 1, current + str.charAt(index));

//         subsequence(str, index + 1, current);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string to print subsequence");
//         String input = sc.nextLine();
//         subsequence(input, 0, "");
//     }
// }

// let's write the code if there is any array instead of the string 

import java.util.ArrayList;
import java.util.List;

public class SubsequenceRecursion {

    static void print(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        current.add(arr[index]);
        print(arr, index + 1, current);

        current.remove(current.size() - 1);
        print(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        print(arr, 0, new ArrayList<>());

    }
}