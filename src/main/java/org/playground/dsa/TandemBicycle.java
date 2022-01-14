package org.playground.dsa;
import java.util.*;

class TandemBicycle {

    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {

        if (redShirtSpeeds.length == 0) {
            return 0;
        }
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        int totalSpeed = 0;

        for (int idx = 0; idx < redShirtSpeeds.length; idx++) {
            int redRiderSpeed = redShirtSpeeds[idx];
            int blueRiderSpeed = blueShirtSpeeds[redShirtSpeeds.length - ( idx + 1 ) ];

            if (fastest) {
                totalSpeed += (redRiderSpeed >= blueRiderSpeed) ? redRiderSpeed : blueRiderSpeed;
            } else {
                totalSpeed += (redRiderSpeed <= blueRiderSpeed) ? redRiderSpeed : blueRiderSpeed;
            }
        }
        return totalSpeed;
    }
}
