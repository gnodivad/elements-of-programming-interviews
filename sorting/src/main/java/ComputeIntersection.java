import java.util.List;
import java.util.ArrayList;

public class ComputeIntersection {

    /*
     * 14.1
     */

    public static List<Integer> intersection(List<Integer> A, List<Integer> B) {

        List<Integer> intersections = new ArrayList<Integer>();
        Integer lastIndex = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size() && B.get(j) <= A.get(i); j++) {
                if (A.get(i) == B.get(j) && B.get(j) != lastIndex) {
                    intersections.add(A.get(i));
                    lastIndex = A.get(i);
                }
            }
        }

        return intersections;
    }
}
