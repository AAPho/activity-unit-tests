package com.csc205;

public class CalculatorService {

    private Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int execute(String operation, int a, int b) {

        switch(operation) {
            case "add":
                return calculator.add(a, b);

            case "subtract":
                return calculator.subtract(a, b);

            case "multiply":
                return calculator.multiply(a, b);

            case "divide":
                return calculator.divide(a , b);

            default:
                throw new IllegalArgumentException();
        }
    }

    public int execute(String operation, int a, int...b) {

        if("add".equals(operation)) {
            return calculator.add(a, b);
        }
        throw new IllegalArgumentException();
    }
}