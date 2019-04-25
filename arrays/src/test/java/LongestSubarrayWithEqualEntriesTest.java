import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LongestSubarrayWithEqualEntriesTest {

    private List<Integer> integers;
    private int longestStreak;

    @Test
    public void longestSubarrayWithEqualEntries1() {
        integers = Arrays.asList(3, 2, 5, 5, 3, 2, 2, 2, 3, 7, 7, 7, 7, 7, 6, 7, 3, 3, 3, 3);
        longestStreak = 5;

        test(integers, longestStreak);
    }

    @Test
    public void longestSubarrayWithEqualEntries2() {
        integers = Arrays.asList(0, 1);
        longestStreak = 1;

        test(integers, longestStreak);
    }

    private void test(List<Integer> integers, int longestStreak) {
        assertEquals(longestStreak, LongestSubarrayWithEqualEntries.longestSubarrayWithEqualEntries(integers));
    }

}