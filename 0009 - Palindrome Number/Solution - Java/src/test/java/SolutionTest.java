import maxhilmbauer.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isPalindromeCase1() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void isPalindromeCase2() {
        assertFalse(solution.isPalindrome(-121));

    }

    @Test
    void isPalindromeCase3() {
        assertFalse(solution.isPalindrome(10));

    }

}
