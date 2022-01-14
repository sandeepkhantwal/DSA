package org.playground.dsa;

import java.util.*;

public class FindClosestNoInArray {
    public static int findClosestNoInArray (int[] array, int target) {
        int closest = Integer.MAX_VALUE;

        for (int item : array) {
            if (Math.abs (target - item) < Math.abs(target - closest)) {
                closest = item;
            }
        }
        return closest;
    }
}
