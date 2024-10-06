import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome("1221"));
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("123"));
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama".replaceAll("\\s+", "").toLowerCase()));
        assertFalse(PalindromeChecker.isPalindrome(null));
    }
}