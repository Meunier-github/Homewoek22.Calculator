package pro.sky.Homework22.Calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST,reason = "Деление на 0!")
public class CustomArithmeticException extends RuntimeException{
    public CustomArithmeticException() {
    }
}
