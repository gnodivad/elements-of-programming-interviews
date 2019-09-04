import java.util.Arrays;
import java.util.List;

public class MergeSorted {

    /*
     * 14.2
     */

    public static void merge(List<Integer> A, int m, List<Integer> B, int n) {
        int firstArrayPosition = m - 1;
        int secondArrayPosition = n - 1;
        int lastItemPosition = m + n - 1;

        while (lastItemPosition >= 0) {
            System.out.println(firstArrayPosition + " " + secondArrayPosition + " " + lastItemPosition);
            if (firstArrayPosition < 0) {
                A.set(lastItemPosition, B.get(secondArrayPosition));
                secondArrayPosition--;
            } else if (secondArrayPosition < 0) {
                A.set(lastItemPosition, A.get(firstArrayPosition));
                firstArrayPosition--;
            } else {
                if (A.get(firstArrayPosition) > B.get(secondArrayPosition)) {
                    A.set(lastItemPosition, A.get(firstArrayPosition));
                    firstArrayPosition--;
                } else {
                    A.set(lastItemPosition, B.get(secondArrayPosition));
                    secondArrayPosition--;
                }
            }
            lastItemPosition--;
        }
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(5, 13, 17, null, null, null, null, null);
        int m = 3;
        List<Integer> B = Arrays.asList(3, 7, 11, 19);
        int n = B.size();
        merge(A, m, B, n);
    }
}
