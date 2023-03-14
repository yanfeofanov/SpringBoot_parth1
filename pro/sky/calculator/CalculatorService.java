package pro.sky.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public String calculatorPlus(int numFirst, int numTwo) {
        return numFirst + " + " + numTwo + " = " + (numFirst + numTwo);
    }

    public String calculatorMinus(int numFirst, int numTwo) {
        return numFirst + " - " + numTwo + " = " + (numFirst - numTwo);
    }

    public String calculatorMultiply(int numFirst, int numTwo) {
        return numFirst + " * " + numTwo + " = " + (numFirst * numTwo);
    }

    public String calculatorDivide(int numFirst, int numTwo) {
        return numFirst + " / " + numTwo + " = " + (numFirst / numTwo);
    }


}
