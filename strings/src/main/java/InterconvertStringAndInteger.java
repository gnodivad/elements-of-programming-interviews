public class InterconvertStringAndInteger {

    /*
     * 7.1
     */

    public static Integer stringToInt(String number) {

        boolean isNegative = false;
        if (number.toCharArray()[0] == '-') {
            isNegative = true;
        }

        int intNumber = 0, digit = 1;
        for (int i = number.toCharArray().length - 1; i >= (isNegative ? 1 : 0); i--) {

            intNumber += (number.toCharArray()[i] - '0') * digit;
            digit *= 10;
        }

        return isNegative ? -1 * intNumber : intNumber;

    }

    public static String intToString(Integer number) {

        boolean isNegative = false;
        if (number == 0)
            return "0";
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }

        String s = "";
        while (number > 0) {
            s = (number % 10) + s;
            number /= 10;
        }

        return isNegative ? "-" + s : s;
    }
}
