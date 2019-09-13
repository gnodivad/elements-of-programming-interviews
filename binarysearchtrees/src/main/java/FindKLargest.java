import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindKLargest {

    /*
     * 15.3
     */

    public static List<Integer> findLargest(BinaryTree<Integer> tree, int k) {
        List<Integer> largestElement = new ArrayList<>();

        findKLargestInBSTHelper(tree, k, largestElement);

        return largestElement;
    }

    private static void findKLargestInBSTHelper(BinaryTree<Integer> tree, int k, List<Integer> largestElement) {
        if (tree != null && largestElement.size() < k) {
            findKLargestInBSTHelper(tree.right, k, largestElement);
            if (largestElement.size() < k) {
                largestElement.add(tree.data);
                findKLargestInBSTHelper(tree.left, k, largestElement);
            }
        }
    }
}
