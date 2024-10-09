package pro.sky.Homework22.Calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTestParameterizedTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTestsPlus")
    public void calculatorPlus(Integer num1, Integer num2, String expectedMessage) {
        String result = out.CalculatorPlus(num1, num2);
        assertEquals(expectedMessage, result);
    }


    @ParameterizedTest
    @MethodSource("provideParamsForTestsMinus")
    public void calculatorMinus(Integer num1, Integer num2, String expectedMessage) {
        String result = out.CalculatorMinus(num1, num2);
        assertEquals(expectedMessage, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsMultiply")
    public void calculatorMultiply(Integer num1, Integer num2, String expectedMessage) {
        String result = out.CalculatorMultiply(num1, num2);
        assertEquals(expectedMessage, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsDivide")
    public void calculatorDivide(Integer num1, Integer num2, String expectedMessage) {
        String result = out.CalculatorDivide(num1, num2);
        assertEquals(expectedMessage, result);
    }

    public static Stream<Arguments> provideParamsForTestsPlus() {
        return Stream.of(
                Arguments.of(5, 5, "5 + 5 = 10"),
                Arguments.of(4, 2, "4 + 2 = 6"),
                Arguments.of(4, null, "Необходимо ввести параметры num1 и num2!")
        );
    }

    public static Stream<Arguments> provideParamsForTestsMinus() {
        return Stream.of(
                Arguments.of(5, 5, "5 - 5 = 0"),
                Arguments.of(4, 2, "4 - 2 = 2"),
                Arguments.of(4, null, "Необходимо ввести параметры num1 и num2!")

        );
    }

    public static Stream<Arguments> provideParamsForTestsMultiply() {
        return Stream.of(
                Arguments.of(5, 5, "5 * 5 = 25"),
                Arguments.of(4, 2, "4 * 2 = 8"),
                Arguments.of(4, null, "Необходимо ввести параметры num1 и num2!")

        );
    }

    public static Stream<Arguments> provideParamsForTestsDivide() {
        return Stream.of(
                Arguments.of(5, 5, "5 / 5 = 1.0"),
                Arguments.of(4, 2, "4 / 2 = 2.0"),
                Arguments.of(4, null, "Необходимо ввести параметры num1 и num2!")

        );
    }


}
