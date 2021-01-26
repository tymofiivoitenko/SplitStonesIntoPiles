package main;

/**
 * @author tymofiivoitenko
 */
public class Main {

    public static void main(String[] args) {
        int[] testArray = new int[]{2, 3, 2, 1, 4};

        System.out.println("The minimum difference is: " + PileSplitter.splitWithMinDifference(testArray));
    }
}
