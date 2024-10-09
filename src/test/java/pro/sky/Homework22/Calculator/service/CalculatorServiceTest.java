package pro.sky.Homework22.Calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService out = new CalculatorServiceImpl();
    @Test
    void calculatorPlus() {
        Integer num1 = 5;
        Integer num2 = 5;
        String response = out.CalculatorPlus(num1, num2);
        assertEquals("5 + 5 = 10", response);
        num1 = null;
        num2 = 1;
        response = out.CalculatorPlus(num1, num2);
        assertEquals("Необходимо ввести параметры num1 и num2!", response);
    }

    @Test
    void calculatorMinus() {
        Integer num1 = 5;
        Integer num2 = 5;
        String response = out.CalculatorMinus(num1, num2);
        assertEquals("5 - 5 = 0", response);
        num1 = null;
        num2 = null;
        response = out.CalculatorMinus(num1, num2);
        assertEquals("Необходимо ввести параметры num1 и num2!", response);
    }

    @Test
    void calculatorMultiply() {
        Integer num1 = 5;
        Integer num2 = 5;
        String response = out.CalculatorMultiply(num1, num2);
        assertEquals("5 * 5 = 25", response);
        num1 = 2;
        num2 = null;
        response = out.CalculatorMultiply(num1, num2);
        assertEquals("Необходимо ввести параметры num1 и num2!", response);

    }

    @Test
    void calculatorDivide() {
        Integer num1 = 5;
        Integer num2 = 5;
        String response = out.CalculatorDivide(num1, num2);
        assertEquals("5 / 5 = 1.0", response);
    }
    @Test
    public void testDivideOnZero() {
        assertThrows(IllegalArgumentException.class,
                ()->{out.CalculatorDivide(5,0);});
    }

}