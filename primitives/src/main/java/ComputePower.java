public class ComputePower {

    /*
     * 5.7
     */

    public static double power(double x, int y) {
        double result = 1.0;
        long power = y;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        while (power != 0) {
            if ((power & 1) != 0) {
                result *= x;
            }

            x *= x;
            power >>>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 2));
    }
}
