package org.playground.dsa;

import static org.junit.Assert.*;
import org.junit.Test;

public class FindClosestNoInArrayTest {

    @Test
    public void testCase1() {
        int closest = FindClosestNoInArray.findClosestNoInArray(new int[] {1, 5, 2, 9, 4}, 6);

        assertEquals(5, closest);
    }

    @Test
    public void testCase2() {
        int closest = FindClosestNoInArray.findClosestNoInArray(new int[] {1, -5, 2, -9, 4}, 6);

        assertEquals(4, closest);
    }

    @Test
    public void testCase3() {
        int closest = FindClosestNoInArray.findClosestNoInArray(new int[] {-1000, -500000, -20000, -9000000, -40000}, 6);

        assertEquals(-1000, closest);
    }
}
