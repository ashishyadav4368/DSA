public class SelectionSort {

    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop - runs (n-1) times
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index has the smallest element
            int minIndex = i;

            // Inner loop - find the actual minimum in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
