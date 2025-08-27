// public class PrintOneToN {

//     static void PrintNum(int i, int n) {
//         if (i > n) {
//             return;

//         }
//         System.out.println(i);

//         PrintNum(i + 1, n);
//     }

//     public static void main(String[] args) {
//         PrintNum(1, 10);
//     }
// }

public class PrintOneToN {

    static void PrintNum(int i) {
        if (i < 1) {
            return;

        }

        PrintNum(i - 1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        PrintNum(10);
    }
}