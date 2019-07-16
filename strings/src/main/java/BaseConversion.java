import java.util.Arrays;
import java.util.List;

public class BaseConversion {

    /*
     * 7.2
     */

    public static String baseConversion(String s, int b1, int b2) {

        List<String> characterMap = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D",
                "E", "F");

        int base10Integer = 0;
        if (b1 == 10) {
            base10Integer = Integer.parseInt(s);
        } else {
            String unsignString = s.charAt(0) == '-' ? s.substring(1) : s;

            for (int i = 0; i < unsignString.length(); i++) {

                base10Integer += characterMap.indexOf("" + unsignString.charAt(i))
                        * Math.pow(b1, unsignString.length() - i - 1);
            }
        }

        String toString = "";
        while (base10Integer > 0) {
            toString = characterMap.get(base10Integer % b2) + toString;
            base10Integer /= b2;
        }

        return s.charAt(0) == '-' ? ("-" + toString) : toString;
    }

    public static void main(String[] args) {
        baseConversion("-62543", 7, 13);
    }
}
