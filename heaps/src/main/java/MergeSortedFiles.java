import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeSortedFiles {

    /*
     * 11.1
     */

    public static List<Integer> mergeSorted1(List<List<Integer>> sortedArrays) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (List<Integer> array : sortedArrays) {
            for (Integer integer : array) {
                heap.add(integer);
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!heap.isEmpty()) {
            result.add(heap.remove());
        }

        return result;
    }
}
