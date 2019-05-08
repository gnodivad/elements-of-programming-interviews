import java.util.HashMap;
import java.util.Map;

public class PalindromicPermutations {

    /*
     * 13.1
     */

    // Palindromic string should form by
    // 1. all characters is in even number
    // 2. or less than two characters have odd number.

    public static boolean canFormPalindrome(String s) {
        Map<Character, Integer> charFrequencies = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);

            if (!charFrequencies.containsKey(ch)) {
                charFrequencies.put(ch, 1);
            } else {
                charFrequencies.put(ch, charFrequencies.get(ch) + 1);
            }
        }

        int oddCount = 0;
        for (Map.Entry<Character, Integer> frequency : charFrequencies.entrySet()) {
            if ((frequency.getValue() % 2 != 0) && ++oddCount > 1) {
                return false;
            }
        }

        return true;
    }
}
