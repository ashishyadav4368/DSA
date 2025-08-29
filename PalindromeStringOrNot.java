import java.util.*;

// class PalindromeStringOrNot {

//     static boolean isPalindrome(String str, int i) {
//         int n = str.length();
//         if (i >= n / 2) {
//             return true;
//         }
//         if (str.charAt(i) != str.charAt(n - i - 1)) {
//             return false;
//         }
//         return isPalindrome(str, i + 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string");
//         String input = sc.nextLine();
//         if (isPalindrome(input, 0)) {
//             System.out.println(input + " is a palindrome String ");
//         } else {
//             System.out.println(input + " is not a palindrome string ");
//         }
//     }
// }

//  this program can also be done by using two variables instead of one variable i , we can take two variables left and right 

public class PalindromeStringOrNot {
    static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string to check : ");
            String input = sc.nextLine();
            if (isPalindrome(input, 0, input.length() - 1)) {
                System.out.println("it's palindrome");
            } else {
                System.out.println("it's not palindrome ");
            }
        }
    }
}