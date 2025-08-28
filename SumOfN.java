public class SumOfN {
    static void PrintSum(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);

            return;
        }
        PrintSum(i - 1, sum + i);
    }

    public static void main(String[] args) {
        PrintSum(5, 0);
    }
}
// sum of first n natural numbers using recursion