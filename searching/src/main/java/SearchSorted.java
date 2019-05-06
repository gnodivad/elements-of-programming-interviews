import java.util.List;

public class SearchSorted {

    /*
     * 12.1
     */

    public static int search(List<Integer> list, int k) {

        int index = binarySearch(list, k);

        int smallestIndex = index;
        while (index > 0) {
            if (list.get(index) == k) {
                smallestIndex = index;
            }

            index--;
        }

        return smallestIndex;
    }

    public static int binarySearch(List<Integer> list, int k) {
        int high = list.size() - 1;
        int low = 0;

        while (low <= high) {
            int medium = (high + low) / 2;

            if (list.get(medium) < k) {
                low = medium + 1;
            } else if (list.get(medium) > k) {
                high = medium - 1;
            } else {
                return medium;
            }
        }

        return -1;
    }
}
