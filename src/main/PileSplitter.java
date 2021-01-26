package main;

import main.algorithms.DynamicProgrammingAlgorithmSplit;
import main.algorithms.RecursionAlgorithmSplit;
import main.algorithms.SplitStonesIntoPilesAlgorithm;
import java.util.Arrays;

/**
 * @author tymofiivoitenko
 */
public class PileSplitter {

    // Split set into two subsets such that the difference of sums of elements is min
    // Return minimum difference
    public static int splitWithMinDifference(int[] stones) {
        SplitStonesIntoPilesAlgorithm algorithm;
        int numberOfElements = stones.length;
        int sumOfElements = Arrays.stream(stones).sum();

        // Decide which algorithm to use, in order to reach minimum time complexity:
        // (1) Recursion algorithm Time Complexity = O(2^n)
        // (2) Dynamic Programming algorithm Time Complexity = O(n*sum)
        if (Math.pow(2, numberOfElements) < numberOfElements * sumOfElements) {
            algorithm = new RecursionAlgorithmSplit();
            algorithm = new DynamicProgrammingAlgorithmSplit();
        } else {
            algorithm = new DynamicProgrammingAlgorithmSplit();
        }

        return algorithm.getMinimalDifference(stones);
    }
}
