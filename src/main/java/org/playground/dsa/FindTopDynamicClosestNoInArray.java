package org.playground.dsa;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class FindTopDynamicClosestNoInArray {
    public static int[] findTopDynamicClosestNoInArray (int[] array, int target, int top) {
        // Code with multiple for loops for checking element in closest array
        // and another for moving elements to the nxt position
        /*
        int[] closest = new int[top];
        Arrays.fill(closest, Integer.MAX_VALUE);

        for (int item : array) {
            for (int closestIdx = 0; closestIdx < closest.length; closestIdx ++) {
                if (Math.abs(target - item) < Math.abs(target - closest [ closestIdx ] )) {
                    for ( int revIdx = closest.length - 1; revIdx > closestIdx; revIdx --) {
                        closest [ revIdx ] = closest [ revIdx - 1 ];
                    }
                    closest [ closestIdx ] = item;
                    break;
                }
            }
        }*/

        LinkedList<Integer> closestList = new LinkedList<Integer>();
        closestList.add(Integer.MAX_VALUE);
        ListIterator<Integer> closestListItr = closestList.listIterator();

        for (int item : array) {
            while (closestListItr.hasNext()) {
                int currentClosest = closestListItr.next();
                if (Math.abs(target - item) < Math.abs(target - currentClosest)) {
                    closestListItr.add(currentClosest);
                    break;
                }
            }
        }

        Integer[] closestArray = closestList.subList(0, top).toArray(new Integer[0]);
        return Arrays.stream(closestArray).mapToInt(Integer::intValue).toArray();
    }
}
