public class ReplaceAndRemove {

    /*
     * 7.4
     */

    public static String replaceAndRemove(char[] s, int k) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < k; i++) {
            if (s[i] == 'a') {
                sb.append("dd");
            } else if (s[i] == 'b') {

            } else {
                sb.append(s[i]);
            }
        }

        return sb.toString();
    }

}
