public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String testString = "121";
        String result = isPalindrome(testString) ? " is a palindrome" : " is not a palindrome";
        System.out.println(testString + result);
    }
}