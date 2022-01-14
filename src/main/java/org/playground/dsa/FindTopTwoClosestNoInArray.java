package org.playground.dsa;

public class FindTopTwoClosestNoInArray {
    public static int[] findTopTwoClosestNoInArray (int[] array, int target) {
        int closestOne = Integer.MAX_VALUE;
        int closestTwo = Integer.MAX_VALUE;

        for (int item : array) {
            if (Math.abs (target - item) < Math.abs(target - closestOne)) {
                closestTwo = closestOne;
                closestOne = item;
                continue;
            }
            if (Math.abs (target - item) < Math.abs(target - closestTwo)) {
                closestTwo = item;
            }
        }
        return new int[] {closestOne, closestTwo};
    }
}
