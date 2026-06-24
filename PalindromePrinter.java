public class PalindromePrinter {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
    private static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;                     // Extract the last digit
            reversedNum = (reversedNum * 10) + lastDigit; // Shift left and add digit
            num = num / 10;                               // Drop the last digit from original
        }

        return originalNum == reversedNum;
    }
}