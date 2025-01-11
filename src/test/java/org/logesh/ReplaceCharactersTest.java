package org.logesh;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReplaceCharactersTest {
    public static ReplaceCharacters replaceCharacters = null;

    @BeforeClass
    public static void setup() {
        replaceCharacters = new ReplaceCharacters();
    }

    // Condition 1
    @Test
    public void testReplaceFirst2AsWith$_condition1() {
        String actual = replaceCharacters.replaceFirst2AsWith$("AA");
        Assert.assertEquals("", actual);
    }

    // Condition 2
    @Test
    public void testReplaceFirst2AsWith$_condition2() {
        String actual = replaceCharacters.replaceFirst2AsWith$("AB");
        Assert.assertEquals("B", actual);
    }
}
