public class IntegerSquareRoot {

    /*
     * 12.4
     */

    public static int squareRoot(int n) {

        int left = 0, right = n;

        while (left <= right) {
            int medium = (left + right) / 2;
            int midSquared = medium * medium;
            if (midSquared <= n) {
                left = medium + 1;
            } else {
                right = medium - 1;
            }
        }

        return (int) left;
    }
}
