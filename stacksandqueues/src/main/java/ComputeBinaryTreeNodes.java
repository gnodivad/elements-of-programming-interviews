import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ComputeBinaryTreeNodes {

    /*
     * 9.7
     */

    public static List<List<Integer>> binaryTreeDepthOrder(BinaryTree<Integer> tree) {

        Queue<BinaryTree<Integer>> currentLevelNodeQueue = new LinkedList<>();
        currentLevelNodeQueue.add(tree);
        List<List<Integer>> result = new ArrayList<>();

        while (!currentLevelNodeQueue.isEmpty()) {
            Queue<BinaryTree<Integer>> nextLevelNodQueue = new LinkedList<>();
            List<Integer> currentLevel = new ArrayList<>();

            while (!currentLevelNodeQueue.isEmpty()) {
                BinaryTree<Integer> node = currentLevelNodeQueue.poll();

                if (node != null) {
                    currentLevel.add(node.data);
                    nextLevelNodQueue.add(node.left);
                    nextLevelNodQueue.add(node.right);
                }
            }

            if (!currentLevel.isEmpty()) {
                result.add(currentLevel);
            }
            currentLevelNodeQueue = nextLevelNodQueue;
        }

        return result;
    }
}
