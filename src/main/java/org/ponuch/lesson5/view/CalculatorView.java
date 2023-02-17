package org.ponuch.lesson5.view;

import org.ponuch.lesson5.controller.Calculator;
import org.ponuch.lesson5.model.OperationData;
import org.ponuch.lesson5.model.OperationType;

import java.util.Scanner;

public class CalculatorView {
    private final Calculator calculator;
    public CalculatorView(Calculator calculator) {
        this.calculator = calculator;
    }

    public void printMenu () {
        System.out.println("Введите два числа:");
        Scanner sc = new Scanner(System.in);
        var firstOperand = sc.nextDouble();
        var secondOperand = sc.nextDouble();

        System.out.println("""
                    Выберите действие:\s
                    1. Сложение
                    2. Вычитание
                    3. Умножение
                    4. Деление
                """);

        int action = sc.nextInt();
        var result = switch (action) {
            case 1 -> calculator.calculate(new OperationData(firstOperand, secondOperand, OperationType.ADD));
            case 2 -> calculator.calculate(new OperationData(firstOperand, secondOperand, OperationType.SUB));
            case 3 -> calculator.calculate(new OperationData(firstOperand, secondOperand, OperationType.MUL));
            case 4 -> calculator.calculate(new OperationData(firstOperand, secondOperand, OperationType.DIV));
            default -> throw new IllegalStateException("Unexpected value: " + action);
        };

        System.out.println("Result = " + result.result());
    }
}
