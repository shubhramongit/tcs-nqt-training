import java.util.Arrays;
public class ArrayRotator {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; 

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateRight(arr, k);
        System.out.println("Rotated Array:  " + Arrays.toString(arr));
    }

    public static void rotateRight(int[] arr, int k) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        
        k = k % n; 
        
        if (k == 0) {
            return;
        }
        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);
        
        // Step 3: Reverse the remaining n - k elements
        reverse(arr, k, n - 1);
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}