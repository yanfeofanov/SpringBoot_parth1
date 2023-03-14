package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    private final CalculatorService calculatorService;
    private final String localNull = "Деление на 0 не возможно";

    private final String localEmpty = "Не должно быть пустых значений";

    public CalculateController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return "Главная страница";
    }

    @GetMapping(path = "/calculator")
    public String calculatorHello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator/plus")
    public String calculatorPlus(@RequestParam("num1") String numFirst, @RequestParam("num2") String numTwo) {
        if (numFirst.isEmpty() || numTwo.isEmpty()) {
            return localEmpty;
        }
        return calculatorService.calculatorPlus(Integer.parseInt(numFirst), Integer.parseInt(numTwo));
    }

    @GetMapping(path = "/calculator/minus")
    public String calculatorMinus(@RequestParam("num1") String numFirst, @RequestParam("num2") String numTwo) {
        if (numFirst.isEmpty() || numTwo.isEmpty()) {
            return localEmpty;
        }
        return calculatorService.calculatorMinus(Integer.parseInt(numFirst), Integer.parseInt(numTwo));
    }

    @GetMapping(path = "/calculator/multiply")
    public String calculatorMultiply(@RequestParam("num1") String numFirst, @RequestParam("num2") String numTwo) {
        if (numFirst.isEmpty() || numTwo.isEmpty()) {
            return localEmpty;
        }
        return calculatorService.calculatorMultiply(Integer.parseInt(numFirst), Integer.parseInt(numTwo));
    }


    @GetMapping(path = "/calculator/divide")
    public String calculatorDivide(@RequestParam("num1") String numFirst, @RequestParam("num2") String numTwo) {
        if (numFirst.isEmpty() || numTwo.isEmpty()) {
            return localEmpty;
        }
        if (Integer.parseInt(numFirst) == 0 || Integer.parseInt(numTwo) == 0) {
            return localNull;
        }
        return calculatorService.calculatorDivide(Integer.parseInt(numFirst), Integer.parseInt(numTwo));
    }

}
