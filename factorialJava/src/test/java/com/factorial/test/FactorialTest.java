package com.factorial.test;

import com.factorial.Factorial;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FactorialTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    @DisplayName("Should calculate the factorial of a number greater than 1")
    public void testCalculate_withHigherThanOne() {
        // Arrange
        int testNumber = 5;

        // Act
        long factorialResult = Factorial.calculate(testNumber);

        // Assert
        Assertions.assertEquals(120, factorialResult);
    }

    @Test
    @DisplayName("Should return 1 with the factorial of 1")
    public void testCalculate_withOne() {
        // Arrange
        int testNumber = 1;

        // Act
        long factorialResult = Factorial.calculate(testNumber);

        // Assert
        Assertions.assertEquals(1, factorialResult);
    }

    @Test
    @DisplayName("Should return 1 with the factorial of 0")
    public void testCalculate_withZero() {
        // Arrange
        int testNumber = 0;

        // Act
        long factorialResult = Factorial.calculate(testNumber);

        // Assert
        Assertions.assertEquals(1, factorialResult);
    }

    @Test
    @DisplayName("Should throw a error with a negative number")
    public void testCalculate_withNegative() {
        // Arrange
        int testNumber = -1;
        String expectedMessage = "Factorial of negative numbers can not exist.";

        // Act && Assert
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculate(testNumber);
        });
        Assertions.assertEquals(expectedMessage, outputStreamCaptor.toString().trim());
    }
}