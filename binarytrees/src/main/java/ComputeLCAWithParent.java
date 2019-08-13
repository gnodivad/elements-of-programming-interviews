public class ComputeLCAWithParent {

    /*
     * 10.4
     */

    public static BinaryTreeParent<Integer> LCA(BinaryTreeParent<Integer> node0, BinaryTreeParent<Integer> node1) {
        int node0Depth = depth(node0);
        int node1Depth = depth(node1);
        BinaryTreeParent<Integer> firstPointer = node0;
        BinaryTreeParent<Integer> secondPointer = node1;

        while (node0Depth >= 0 && node1Depth >= 0) {
            if (firstPointer == secondPointer) {
                return firstPointer;
            }

            if (node0Depth > node1Depth) {
                firstPointer = firstPointer.parent;
                node0Depth--;
            } else {
                secondPointer = secondPointer.parent;
                node1Depth--;
            }
        }

        return null;
    }

    public static int depth(BinaryTreeParent<Integer> node) {
        int depth = 0;
        while (node.parent != null) {
            depth++;
            node = node.parent;
        }

        return depth;

    }
}
