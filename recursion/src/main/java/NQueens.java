import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NQueens {

    /*
     * 16.2
     */

    public static List<List<Integer>> nQueens(int n) {
        List<List<Integer>> results = new ArrayList<>();

        nQueensRotation(0, n, new ArrayList<Integer>(), results);

        return results;
    }

    public static void nQueensRotation(int row, int n, List<Integer> columns, List<List<Integer>> results) {
        if (row == n) {
            results.add(new ArrayList<>(columns));
        } else {
            for (int i = 0; i < n; i++) {
                columns.add(i);
                if (isValid(columns)) {
                    nQueensRotation(row + 1, n, columns, results);
                }
                columns.remove(columns.size() - 1);
            }
        }
    }

    public static boolean isValid(List<Integer> columns) {
        int rowId = columns.size() - 1;
        for (int i = 0; i < rowId; i++) {
            int diff = Math.abs(columns.get(i) - columns.get(rowId));
            if (diff == 0 || diff == rowId - i) {
                return false;
            }
        }

        return true;
    }
}
