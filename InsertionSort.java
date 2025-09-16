public class InsertionSort {
    public static void InsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Utility method to print array
    // public static void printArray(int[] arr) {
    // for (int num : arr) {
    // System.out.print(num + " ");
    // }
    // System.out.println();
    // }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 4, 5, 1, 23, 5, 4, 9, 5 };
        InsertionSort(arr);
        printArray(arr);

    }
}
