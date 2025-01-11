package org.logesh;

import org.junit.*;

public class AdditionTest {

    Addition addition = null;

    // Runs only once
    // Method should be static
    @BeforeClass
    public static void setupOnce() {
        System.out.println("Before Class");
    }

    // Runs before every test method
    @Before
    public void setup() {
        // Initialization and Setups
        addition = new Addition(); // better to move this under @BeforeClass
    }

    @Test
    public void testAdd() {
        int actual = addition.add(2, 3);
        Assert.assertEquals(5, actual);
    }

    @Test
    public void testAdd2() {
        int actual = addition.add(3, 3);
        Assert.assertEquals(6, actual);
    }

    // Runs after every method
    @After
    public void tearDown() {
        // closing database connections and everything
        System.out.println("Test Completed !!");
    }
}
