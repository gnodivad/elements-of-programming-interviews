import java.util.List;

public class LongestSubarrayWithEqualEntries {

    /*
     * 6.6 Variant
     */

    public static int longestSubarrayWithEqualEntries(List<Integer> integers) {
        int streak = 1;
        int number = Integer.MAX_VALUE;
        int longestStreak = 1;

        for (int integer : integers) {
            if (integer != number) {
                streak = 1;
                number = integer;
            } else {
                streak++;

                longestStreak = Math.max(longestStreak, streak);
            }
        }

        return longestStreak;

    }
}
