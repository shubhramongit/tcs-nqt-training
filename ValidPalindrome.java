public class ValidPalindrome{

    public static void main(String[] args) {
        String s = "a-b-C&b4a";
        
        System.out.println("Original String: " + s);
        checkAndPrintPalindrome(s);
    }
    public static void checkAndPrintPalindrome(String s) {
        if (s == null) {
            System.out.println("String is null.");
            return;
        }

        StringBuilder cleanedString = new StringBuilder(s.length());

        // Step 1: Build the cleaned string in O(n) time
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isLetter(currentChar)) {
                // Convert to lowercase immediately before appending
                cleanedString.append(Character.toLowerCase(currentChar));
            }
        }
        String result = cleanedString.toString();
        System.out.println("Cleaned String:  " + result);
        // Step 2: Check if the resulting string is a palindrome
        // We can use the simple two-pointer approach on the newly built string
        boolean isPalindrome = true;
        int left = 0;
        int right = result.length() - 1;
        while (left < right) {
            if (result.charAt(left) != result.charAt(right)) {
                isPalindrome = false;
                break; // Stop immediately upon finding a mismatch
            }
            left++;
            right--;
        }
        System.out.println("Is Palindrome:   " + isPalindrome);
    }
}