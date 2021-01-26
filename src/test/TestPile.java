package test;

import main.Pile;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPile {

     @Test
    public void testSplittingPileIntoTwoSetWithEqualSumOfElements() {

         assertEquals(0, Pile.splitArrayIntoTwoSubsetsWithMinDifference(new int[]{1, 2, 8, 11}));
         assertEquals(0, Pile.splitArrayIntoTwoSubsetsWithMinDifference(new int[]{4, 5, 5, 6, 8}));
         assertEquals(0, Pile.splitArrayIntoTwoSubsetsWithMinDifference(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
     }

    @Test
    public void testSplittingPileIntoTwoSubSetsWithMinimumSumDifference() {

        assertEquals(3, Pile.splitArrayIntoTwoSubsetsWithMinDifference(new int[]{5, 8, 13, 27, 14}));
        assertEquals(3, Pile.splitArrayIntoTwoSubsetsWithMinDifference(new int[]{1, 2, 3, 9}));
        assertEquals(2, Pile.splitArrayIntoTwoSubsetsWithMinDifference(new int[]{89409, 34351, 3065, 10128, 27694, 27585, 87350, 33875, 2658, 41606, 57512, 73368, 83345, 37048, 31827, 94644, 15972, 74813, 31441, 70395}));
    }

}
