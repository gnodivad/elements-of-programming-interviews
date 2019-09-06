public class FirstGreaterThan {

    /*
     * 15.2
     */

    public static BinaryTree<Integer> find(BinaryTree<Integer> tree, Integer k) {
        BinaryTree<Integer> subtree = tree, firstSoFar = null;

        while (subtree != null) {
            if (subtree.data > k) {
                firstSoFar = subtree;
                subtree = subtree.left;
            } else {
                subtree = subtree.right;
            }
        }
        return firstSoFar;
    }
}
