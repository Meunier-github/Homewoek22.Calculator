package pro.sky.Homework22.Calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Homework22.Calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/plus")
    public String CalculatorPlus(@RequestParam(value = "num1") Integer num1,
                                 @RequestParam(value = "num2") Integer num2) {
        return calculatorService.CalculatorPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String CalculatorMinus(@RequestParam(value = "num1") Integer num1,
                                  @RequestParam(value = "num2") Integer num2) {
        return calculatorService.CalculatorMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String CalculatorMultiply(@RequestParam(value = "num1") Integer num1,
                                     @RequestParam(value = "num2") Integer num2) {
        return calculatorService.CalculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String CalculatorDivide(@RequestParam(value = "num1") Integer num1,
                                   @RequestParam(value = "num2") Integer num2) {
        return calculatorService.CalculatorDivide(num1, num2);
    }

}