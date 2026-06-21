package Week1.JUnit_Mockito_SL4J.JUnit_BasicTesting.Exercise4;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorAAATest {

    private Calculator calc;

    @Before
    public void setUp() {
        System.out.println("Setup Executed");
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Teardown Executed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(30, result);
    }
}