import java.util.ArrayList;
import java.util.List;

public class ComputeScoreCombinations {

    /*
     * 17.1
     */

    public static int compute(int finalScore, List<Integer> playScores) {

        int[] combinations = new int[finalScore + 1];
        combinations[0] = 1;

        for (int i = 0; i < playScores.size(); i++) {
            for (int j = 1; j <= finalScore; j++) {
                if (j >= playScores.get(i)) {
                    combinations[j] += combinations[j - playScores.get(i)];
                }
            }
        }

        return combinations[finalScore];
    }
}
