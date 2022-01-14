package org.playground.dsa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTopDynamicClosestNoInArrayTest {

    @Test
    public void testCase1() {
        int[] closest = FindTopDynamicClosestNoInArray.findTopDynamicClosestNoInArray(new int[] {1, 5, 2, 7, 4}, 6, 2);

        assertEquals(5, closest[0]);
        assertEquals(7, closest[1]);
    }

    @Test
    public void testCase2() {
        int[] closest = FindTopDynamicClosestNoInArray.findTopDynamicClosestNoInArray(new int[] {1, -5, 10, 9, 2}, 6, 5);

        assertEquals(9, closest[0]);
        assertEquals(10, closest[1]);
        assertEquals(2, closest[2]);
        assertEquals(1, closest[3]);
        assertEquals(-5, closest[4]);
    }

    @Test
    public void testCase3() {
        int[] closest = FindTopDynamicClosestNoInArray.findTopDynamicClosestNoInArray(
                new int[] {-1000, -500000, -20000, -9000000, -40000}, 6, 3);

        assertEquals(-1000, closest[0]);
        assertEquals(-20000, closest[1]);
        assertEquals(-40000, closest[2]);
    }
}
