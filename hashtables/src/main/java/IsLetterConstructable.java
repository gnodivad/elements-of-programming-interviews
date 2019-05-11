import java.util.HashMap;
import java.util.Map;

public class IsLetterConstructable {

    /*
     * 13.2
     */

    public static boolean isConstructable(String letterText, String magazineText) {
        letterText = letterText.toLowerCase();
        magazineText = magazineText.toLowerCase();

        Map<Character, Integer> occurrences = new HashMap();

        for (int i = 0; i < magazineText.length(); i++) {
            char character = magazineText.charAt(i);
            if (occurrences.containsKey(character)) {
                occurrences.put(character, occurrences.get(character) + 1);
            } else {
                occurrences.put(character, 1);
            }
        }

        // System.out.println(occurrences);

        for (int i = 0; i < letterText.length(); i++) {
            char character = letterText.charAt(i);

            if (occurrences.containsKey(character)) {
                if (occurrences.get(character) > 0) {
                    occurrences.put(character, occurrences.get(character) - 1);
                    if (occurrences.get(character) == 0) {
                        occurrences.remove(character);
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
