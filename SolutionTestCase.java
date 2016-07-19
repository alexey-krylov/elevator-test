/**
 * @author Alexey Krylov (lexx)
 * @since 19.07.2016
 */
public class SolutionTestCase {

    /*===========================================[ main() method ]================*/

    public static void main(String[] args) {
        assertEquals(new Solution().solution(new int[]{60, 80, 40}, new int[]{2, 3, 5}, 5, 2, 200), 5);
        assertEquals(new Solution().solution(new int[]{40, 40, 100, 80, 20}, new int[]{3, 3, 2, 2, 3}, 5, 3, 200), 6);
        assertEquals(new Solution().solution(new int[]{200, 200, 100, 100, 20}, new int[]{3, 3, 2, 3, 4}, 5, 5, 200), 9);
    }

    private static void assertEquals(int actual, int expected) {
        if (actual != expected) {
            throw new IllegalStateException(
                    String.format("Invalid test result - expected: %d, actual: %d", expected, actual)
            );
        }
    }
}
