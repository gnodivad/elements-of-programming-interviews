import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class ComputeKClosest {

    /*
     * 11.4
     */

    private static final Star EARTH_COORDINATES = new Star(0, 0, 0);

    public static List<Star> getKClosest(int k, Iterator<Star> stars) {

        PriorityQueue<Star> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());

        while (stars.hasNext()) {
            maxHeap.add(stars.next());

            if (maxHeap.size() == k + 1) {
                maxHeap.remove();
            }
        }

        List<Star> orderStars = new ArrayList<>(maxHeap);
        Collections.sort(orderStars);

        return orderStars;
    }

    public static void main(String[] args) {
        List<Star> expected = Arrays.asList(new Star(0, 0, 1));
        Iterator<Star> stars = Arrays.asList(new Star(0, 0, 1), new Star(0, 0, 2)).iterator();
        List<Star> result = getKClosest(1, stars);

        for (Star star : expected) {
            System.out.println(result.contains(star));
        }
    }
}
