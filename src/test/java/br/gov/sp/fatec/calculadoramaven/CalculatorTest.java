package br.gov.sp.fatec.calculadoramaven;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    private String getMessage(float expected, float received) {
        return "Expected: " + expected + " Received: " + received;
    }

    @Test
    public void shouldSumCorrectly() {
        float expected = 2;
        float actual = calculator.sum();
        assertEquals(getMessage(expected, actual), expected, actual, 0.1f);
    }

    @Test
    public void shouldSubtractCorrectly() {
        float expected = 0;
        float actual = calculator.subtract();
        assertEquals(getMessage(expected, actual), expected, actual, 0.1f);
    }

    @Test
    public void shouldMultiplyCorrectly() {
        float expected = 1;
        float actual = calculator.multiply();
        assertEquals(getMessage(expected, actual), expected, actual, 0.1f);
    }

    @Test
    public void shouldDivideCorrectly() {
        float expected = 1;
        float actual = calculator.divide();
        assertEquals(getMessage(expected, actual), expected, actual, 0.1f);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldNotDivideByZero() {
        calculator.setN2(0);
        calculator.divide();
    }
}
