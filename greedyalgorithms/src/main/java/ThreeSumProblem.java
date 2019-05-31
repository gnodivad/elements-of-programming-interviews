import java.util.HashMap;
import java.util.List;

public class ThreeSumProblem {

    /*
     * 18.4
     */

    public static boolean hasThreeSum(List<Integer> A, int t) {

        HashMap<Integer, Integer> twoSum = new HashMap<Integer, Integer>();

        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                Integer sum = A.get(i) + A.get(j);
                twoSum.put(sum, 1);
            }
        }

        for (int i = 0; i < A.size(); i++) {
            if (twoSum.containsKey(t - A.get(i))) {
                return true;
            }
        }

        return false;
    }
}
