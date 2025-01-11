package org.logesh;

import org.junit.Test;

import java.util.Arrays;

public class ArrayComparisonPerformanceTest {

    /*
    Performance Validation

    Let say, If specific method needs to executed within given timeframe.
     */
    @Test(timeout = 100)  // timeout in MilliSeconds
    public void testArraySort() {
        int[] arr = {3, 2, 1};

        for (int itr = 0; itr < 1000000; itr++) {
            arr[0] = itr;
            Arrays.sort(arr);
        }
    }

}
