import java.util.List;

public class BuySellStockOnce {

    /*
     * 6.6
     */

    public static int buySellStockOnce1(List<Integer> A) {

        int profit = 0;

        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(j) - A.get(i) > profit) {
                    profit = A.get(j) - A.get(i);
                }
            }
        }

        return profit;
    }
}
