import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop does the actual comparing and swapping.
            // Notice "n - 1 - i": We don't check the last 'i' elements 
            // because the largest elements have already "bubbled" to the end.
            for (int j = 0; j < n - 1 - i; j++) {
                
                // If the current element is greater than the next, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by the inner loop, 
            // the array is completely sorted. Break early.
            if (!swapped) {
                break;
            }
        }
    }
}