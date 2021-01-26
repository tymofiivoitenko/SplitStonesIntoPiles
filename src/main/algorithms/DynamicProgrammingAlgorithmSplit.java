package main.algorithms;

import java.util.Arrays;

/**
 * @author tymofiivoitenko
 */
public class DynamicProgrammingAlgorithmSplit implements SplitStonesIntoPilesAlgorithm {

    public int getMinimalDifference(int stones[]) {

        // Calculate sum of all elements in array
        int sum = Arrays.stream(stones).sum();

        // Number of elements in array
        int n = stones.length;

        // Create an array to store
        // results of subproblems
        boolean dp[][] = new boolean[n + 1][sum + 1];

        // Initialize first column as true.
        // 0 sum is possible with all elements
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Initialize top row, except dp[0][0],
        // as false. With 0 elements, no other
        // sum except 0 is possible
        for (int i = 1; i <= sum; i++) {
            dp[0][i] = false;
        }

        // Fill the partition table
        // in bottom up manner
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                // If i'th element is excluded
                dp[i][j] = dp[i - 1][j];

                // If i'th element is included
                if (stones[i - 1] <= j) {
                    dp[i][j] |= dp[i - 1][j - stones[i - 1]];
                }

            }
        }

        // Initialize difference of two sums
        int minDifference = Integer.MAX_VALUE;

        // Find the largest j such that dp[n][j]
        // is true where j loops from sum/2 to 0
        for (int j = sum / 2; j >= 0; j--) {
            // Loop elements in the last row, to find the min difference
            if (dp[n][j]) {
                minDifference = sum - 2 * j;
                break;
            }
        }

        return minDifference;
    }
}
