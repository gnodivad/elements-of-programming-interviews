public class IsBST {

    /*
     * 15.1
     */

    public static boolean isBST(BinaryTree<Integer> tree) {
        if (tree == null) {
            return true;
        }

        if (tree.left != null && tree.data < tree.left.data) {
            return false;
        }

        if (tree.right != null && tree.data > tree.right.data) {
            return false;
        }

        return isBST(tree.left) || isBST(tree.right);

    }
}
