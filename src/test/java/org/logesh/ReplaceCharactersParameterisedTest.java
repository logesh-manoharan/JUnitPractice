package org.logesh;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.Arrays;

@RunWith(Parameterized.class)   // Step 1: Define the TestClass with Parameterized Class Runner
public class ReplaceCharactersParameterisedTest {
    /*
    When should we use Parameterised Test ?
        If we have multiple conditions to validate, which has same inputs with
        same number of parameters and same type of parameters.
     */
    public static ReplaceCharacters replaceCharacters = null;

    public static String inputString;
    public static String expected;

    // Step 3 - Creating Constructors
    public ReplaceCharactersParameterisedTest(String inputString, String expected) {
        this.inputString = inputString;
        this.expected = expected;
    }

    // Step 2 - Creating Parameter Providers
    @Parameterized.Parameters
    public static Collection<String[]> parametersProvider() {
        // Array of Parameters
        String arr[][] = { {"AA", ""}, {"AB", "B"}};
        return Arrays.asList(arr);
    }

    @BeforeClass
    public static void setup() {
        replaceCharacters = new ReplaceCharacters();
    }

    @Test
    public void testReplaceFirst2AsWith$() {
        String actual = replaceCharacters.replaceFirst2AsWith$(inputString);
        Assert.assertEquals(expected, actual);  // Step 4: Using the values passed from Parameters Provider to Constructors
    }

    /*
    If we analyze the results, it will show 2 different tests with INDEX.
    Because we are having 2 set of Parameters
     */
}
