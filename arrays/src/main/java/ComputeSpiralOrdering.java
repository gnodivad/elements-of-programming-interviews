import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComputeSpiralOrdering {

    /*
     * 6.17
     */

    public static List<Integer> matrixInSpiralOrder(List<List<Integer>> squareMatrix) {

        List<List<Boolean>> visited = new ArrayList<>();

        for (int i = 0; i < squareMatrix.size(); i++) {
            List<Boolean> visitedRow = new ArrayList<Boolean>();
            for (int j = 0; j < squareMatrix.get(i).size(); j++) {
                visitedRow.add(false);
            }

            visited.add(visitedRow);
        }

        List<List<Integer>> steps = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 0), Arrays.asList(0, -1),
                Arrays.asList(-1, 0));

        List<Integer> result = new ArrayList<Integer>();
        int x = 0, y = 0, dir = 0;
        for (int i = 0; i < squareMatrix.size() * squareMatrix.size(); i++) {
            visited.get(x).set(y, true);
            result.add(squareMatrix.get(x).get(y));

            int desiredX = x + steps.get(dir).get(0);
            int desiredY = y + steps.get(dir).get(1);
            if (desiredX < 0 || desiredX >= squareMatrix.size() || desiredY < 0 || desiredY >= squareMatrix.size()
                    || visited.get(desiredX).get(desiredY) == true) {
                dir = (dir + 1) % 4;
                desiredX = x + steps.get(dir).get(0);
                desiredY = y + steps.get(dir).get(1);
            }

            x = desiredX;
            y = desiredY;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(matrixInSpiralOrder(
                Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9))));
    }
}
