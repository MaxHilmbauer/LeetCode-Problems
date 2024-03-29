import maxhilmbauer.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void twoSumCase1() {
        assertArrayEquals(
                new int[]{0, 1},
                solution.twoSum(new int[]{2, 7, 11, 15}, 9)
        );
    }

    @Test
    void twoSumCase2() {
        assertArrayEquals(
                new int[]{1, 2},
                solution.twoSum(new int[]{3, 2, 4}, 6)
        );
    }

    @Test
    void twoSumCase3() {
        assertArrayEquals(
                new int[]{0, 1},
                solution.twoSum(new int[]{3, 3}, 6)
        );
    }


}
