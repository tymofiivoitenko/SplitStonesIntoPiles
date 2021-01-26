package main;

/**
 * @author tymofiivoitenko
 */
public class Main {

    public static void main(String[] args) {
        int[] testArray = new int[]{5, 8, 13, 27, 14};

        System.out.println("The minimum difference is: " + PileSplitter.splitWithMinDifference(testArray));
    }
}
