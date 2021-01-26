package main;

import main.algorithms.DynamicProgrammingAlgorithm;
import main.algorithms.RecursionAlgorithm;
import main.algorithms.StonesIntoPilesAlgorithm;
import java.util.Arrays;

/**
 * @author tymofiivoitenko
 */
public class PileSplitter {

    // Split set into two subsets such that the difference of sums of elements is min
    // Return minimum difference
    public static int splitWithMinDifference(int[] stones) {
        StonesIntoPilesAlgorithm algorithm;
        int numberOfElements = stones.length;
        int sumOfElements = Arrays.stream(stones).sum();

        // Decide which algorithm to use, based on number of elements and sum of elements in array:
        // Recursion algorithm Time Complexity = O(2^n)
        // Dynamic Programming algorithm Time Complexity = O(n*sum)
        if (Math.pow(2, numberOfElements) < numberOfElements * sumOfElements) {
            algorithm = new RecursionAlgorithm();
        } else {
            algorithm = new DynamicProgrammingAlgorithm();
        }

        return algorithm.getMinimalDifference(stones);
    }
}
