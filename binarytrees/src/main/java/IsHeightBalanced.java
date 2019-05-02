public class IsHeightBalanced {

    /*
     * 10.1
     */

    public static boolean isBalanced(BinaryTree<Integer> tree) {

        if (tree.left == null || tree.right == null) {
            int leftTreeHeight = recursiveCalculateHeight(tree.left);
            int rightTreeHeight = recursiveCalculateHeight(tree.right);

            return Math.abs(leftTreeHeight - rightTreeHeight) <= 1;
        }

        boolean isLeftTreeBalance = isBalanced(tree.left);
        boolean isRightTreeBalance = isBalanced(tree.right);

        return isLeftTreeBalance && isRightTreeBalance;
    }

    private static int recursiveCalculateHeight(BinaryTree<Integer> tree) {
        if (tree == null) {
            return 0;
        }

        int leftTreeHeight = recursiveCalculateHeight(tree.left);
        int rightTreeHeight = recursiveCalculateHeight(tree.right);

        return Math.max(leftTreeHeight, rightTreeHeight) + 1;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> tree = BinaryTreeUtil.getFigureTenDotOne();
        isBalanced(tree);
    }
}
