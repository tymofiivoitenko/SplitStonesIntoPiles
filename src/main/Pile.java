package main;

import main.pileSplittingAlgorithms.DynamicProgrammingAlgorithm;
import main.pileSplittingAlgorithms.RecursionAlgorithm;
import main.pileSplittingAlgorithms.StonesIntoPilesAlgorithm;

public class Pile {

    // Split set into two subsets such that the difference of subset sums is minimum
    public static int splitArrayIntoTwoSubsetsWithMinDifference(int[] stones) {
        StonesIntoPilesAlgorithm algorithm;
        int numberOfElements = stones.length;
        int sumOfElements = 0;

        // Calulcate sum of elements in array
        for (int i = 0; i < stones.length; i++)
            sumOfElements += stones[i];

        // Decide which algorithm to use, based on number of elements and sum of elements in array:
        // Recursion Time Complexity = O(2^n)
        // Dynamic Programming Time Complexity = O(2^n)
        if (Math.pow(2, numberOfElements) > numberOfElements * sumOfElements) {
            algorithm = new DynamicProgrammingAlgorithm();
        } else {
            algorithm = new RecursionAlgorithm();
        }

        return algorithm.getMinimalDifference(stones);
    }
}
