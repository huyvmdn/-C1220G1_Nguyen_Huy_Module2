package _09_clean_code.bai_tap.thuc_hanh;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {


    @Test
    @DisplayName("Testing addition")
    public void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char ADDITION = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, ADDITION);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    public void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char SUBTRACTION = '-';
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, SUBTRACTION);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    public void testCalculateMul() {
        int firstOperand = 2;
        int secondOperand = 2;
        char MULTIPLICATION = '*';
        int expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand, MULTIPLICATION);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    public void testCalculateDiv() {
        int firstOperand = 6;
        int secondOperand = 3;
        char DIVISION = '/';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, DIVISION);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    public void testCalculateDivByZero() {
        int firstOperand = 2;
        int secondOperand = 0;
        char DIVISION = '/';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, secondOperand, DIVISION);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    public void testCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 0;
        char EQUAL = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, secondOperand, EQUAL);});
    }
}
