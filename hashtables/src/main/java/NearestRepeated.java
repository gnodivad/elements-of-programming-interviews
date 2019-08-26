import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NearestRepeated {

    /*
     * 13.6
     */

    public static int findNearest(List<String> list) {

        HashMap<String, Integer[]> map = new HashMap<String, Integer[]>();

        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                int previousIndex = map.get(list.get(i))[0];
                int distance = map.get(list.get(i))[1];

                map.put(list.get(i), new Integer[] { i, Math.min(distance, i - previousIndex) });
            } else {
                map.put(list.get(i), new Integer[] { i, Integer.MAX_VALUE });
            }
        }

        int minimumDistance = Integer.MAX_VALUE;
        for (String key : map.keySet()) {
            minimumDistance = Math.min(minimumDistance, map.get(key)[1]);
        }

        return minimumDistance;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mark", "Steve", "Mason", "Joan", "Jordan", "Greg", "Mark", "Garth", "Joan",
                "Daisy", "Joan", "Marcus");
        findNearest(list);

    }
}
