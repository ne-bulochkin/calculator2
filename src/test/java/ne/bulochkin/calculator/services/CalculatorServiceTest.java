package ne.bulochkin.calculator.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    private final int num1 = 10;
    private final int num2 = 10;
    private final int num3 = -3;
    private final int num4 = -9;
    private final int num5 = 0;
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void getOnePlusOne() {
        int expected = calculatorService.plus(num1, num2);
        int actual = num1 + num2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinusOnePlusMinusOne() {
        int expected = calculatorService.plus(num3, num4);
        int actual = num3 + num4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getOneMinusOne() {
        int expected = calculatorService.minus(num1, num2);
        int actual = num1 - num2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinusOneMinusMinusOne() {
        int expected = calculatorService.minus(num3, num4);
        int actual = num3 - num4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getOneMultiplyOne() {
        int expected = calculatorService.multiply(num1, num2);
        int actual = num1 * num2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinusOneMultiplyMinusOne() {
        int expected = calculatorService.multiply(num3, num4);
        int actual = num3 * num4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getOneDivideOne() {
        double expected = calculatorService.divide(num1, num2);
        double actual = (double) num1 / (double) num2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divideOneByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num1, num5));
    }


}