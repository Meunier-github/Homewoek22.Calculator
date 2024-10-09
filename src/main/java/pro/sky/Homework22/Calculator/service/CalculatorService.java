package pro.sky.Homework22.Calculator.service;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorService {

    String CalculatorPlus(@RequestParam("num1") Integer num1,
                          @RequestParam("num2") Integer num2
    );

    String CalculatorMinus(@RequestParam("num1") Integer num1,
                           @RequestParam("num2") Integer num2
    );

    public String CalculatorMultiply(@RequestParam("num1") Integer num1,
                                     @RequestParam("num2") Integer num2
    );

    public String CalculatorDivide(@RequestParam("num1") Integer num1,
                                   @RequestParam("num2") Integer num2
    );
}
