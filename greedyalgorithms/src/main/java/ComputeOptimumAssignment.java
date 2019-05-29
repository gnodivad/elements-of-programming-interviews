import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComputeOptimumAssignment {

    /*
     * 18.1
     */

    public static List<Tuple> optimumTaskAssignment(List<Integer> taskDurations) {

        Collections.sort(taskDurations);

        List<Tuple> assignments = new ArrayList<>();

        for (int i = 0, j = taskDurations.size() - 1; i < j; i++, j--) {
            System.out.println("Assign task " + taskDurations.get(i) + " " + taskDurations.get(j));
            assignments.add(new Tuple(taskDurations.get(i), taskDurations.get(j)));
        }

        return assignments;
    }

    public static void main(String[] args) {
        optimumTaskAssignment(Arrays.asList(1, 2, 4, 4, 5, 6));
    }
}
