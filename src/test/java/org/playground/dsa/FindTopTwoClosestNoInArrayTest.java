package org.playground.dsa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTopTwoClosestNoInArrayTest {

    @Test
    public void testCase1() {
        int[] closest = FindTopTwoClosestNoInArray.findTopTwoClosestNoInArray(new int[] {1, 5, 2, 9, 4}, 6);

        assertEquals(5, closest[0]);
        assertEquals(4, closest[1]);
    }

    @Test
    public void testCase2() {
        int[] closest = FindTopTwoClosestNoInArray.findTopTwoClosestNoInArray(new int[] {1, -5, 10, 9, 2}, 6);

        assertEquals(9, closest[0]);
        assertEquals(10, closest[1]);
    }

    @Test
    public void testCase3() {
        int[] closest = FindTopTwoClosestNoInArray.findTopTwoClosestNoInArray(new int[] {-1000, -500000, -20000, -9000000, -40000}, 6);

        assertEquals(-1000, closest[0]);
        assertEquals(-20000, closest[1]);
    }
}
