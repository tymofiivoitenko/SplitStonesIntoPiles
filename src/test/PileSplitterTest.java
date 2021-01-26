package test;

import main.PileSplitter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author tymofiivoitenko
 */
public class PileSplitterTest {

    @Test
    public void testSplittingPileIntoTwoSetWithEqualSumOfElements() {
        assertEquals(0, PileSplitter.splitWithMinDifference(new int[]{1, 2, 8, 11}));
        assertEquals(0, PileSplitter.splitWithMinDifference(new int[]{4, 5, 5, 6, 8}));

        // Create array with 100 elements for testing purposes
        int[] intArray = new int[100];
        for (int i = 0; i < 100; i++) {
            intArray[i] = i;
        }
        assertEquals(0, PileSplitter.splitWithMinDifference(intArray));
    }

    @Test
    public void testSplittingPileIntoTwoSubSetsWithMinimumSumDifference() {

        assertEquals(3, PileSplitter.splitWithMinDifference(new int[]{5, 8, 13, 27, 14}));
        assertEquals(3, PileSplitter.splitWithMinDifference(new int[]{1, 2, 3, 9}));
        assertEquals(2, PileSplitter.splitWithMinDifference(new int[]{89409, 34351, 3065, 10128, 27694, 27585,
                87350, 33875, 2658, 41606, 57512, 73368, 83345, 37048, 31827, 94644, 15972, 74813, 31441, 70395}));
    }

}
