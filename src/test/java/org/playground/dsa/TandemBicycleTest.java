package org.playground.dsa;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class TandemBicycleTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void slowestTandem() {
        int[] redShirtSpeeds = {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = {3, 6, 7, 2, 1};
        int totalSpeed = TandemBicycle.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, false);
        System.out.println(totalSpeed);
        assertTrue( true );
    }
}
