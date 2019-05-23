import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TowersOfHanoi {

    /*
     * 16.1
     */

    private static final int NUM_PEGS = 3;

    public static void compute(int numRings) {
        List<Deque<Integer>> pegs = new ArrayList<>();

        for (int i = 0; i < NUM_PEGS; i++) {
            pegs.add(new LinkedList<>());
        }

        for (int i = 0; i < numRings; i++) {
            pegs.get(0).addLast(i);
        }

        runTowerOfHanoi(numRings, pegs, 0, 1, 2);
    }

    public static void runTowerOfHanoi(int numRings, List<Deque<Integer>> pegs, int fromPeg, int toPeg, int usePeg) {
        if (numRings > 0) {
            runTowerOfHanoi(numRings - 1, pegs, fromPeg, usePeg, toPeg);
            pegs.get(toPeg).addFirst(pegs.get(fromPeg).removeFirst());
            System.out.println("From peg " + fromPeg + " to peg " + toPeg);
            runTowerOfHanoi(numRings - 1, pegs, usePeg, toPeg, fromPeg);
        }
    }

    public static void main(String[] args) {
        compute(4);
    }
}
