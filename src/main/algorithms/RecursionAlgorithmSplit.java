package main.algorithms;

/**
 * @author tymofiivoitenko
 */
public class RecursionAlgorithmSplit implements SplitStonesIntoPilesAlgorithm {

    public int getMinimalDifference(int[] stones) {
        return minPartition(stones, stones.length - 1, 0, 0);
    }

    public int minPartition(int[] S, int n, int S1, int S2) {
        // If list becomes empty, return the absolute difference between two sets
        if (n < 0) {
            return Math.abs(S1 - S2);
        }

        // Case 1. include current item in the subset S1 and recur for remaining items (n - 1)
        int inc = minPartition(S, n - 1, S1 + S[n], S2);

        // Case 2. exclude current item from subset S1 and recur for remaining items (n - 1)
        int exc = minPartition(S, n - 1, S1, S2 + S[n]);

        return Math.min(inc, exc);
    }
}
