package org.logesh;

import org.junit.Test;

import java.util.Arrays;

public class ExecptionHandlingTest {

    /*
    Let say we are expecting the exception to be happended in a Method.
    If exception doesn't araised, then test should FAIL.
    If it is araised, then only test should PASS.
     */
    @Test(expected = NullPointerException.class)
    public void exceptionTest() {
        int[] numbers = null;           // PASS
        // int[] numbers = {1,2,3};     // FAIL
        Arrays.sort(numbers);
    }
}
