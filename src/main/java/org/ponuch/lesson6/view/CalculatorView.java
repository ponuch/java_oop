package org.ponuch.lesson6.view;

import org.ponuch.lesson6.controller.BaseCalculator;
import org.ponuch.lesson6.model.OperationData;
import org.ponuch.lesson6.model.OperationType;

import java.util.Scanner;

public class CalculatorView implements BaseView {
    private final BaseCalculator calculator;
    public CalculatorView(BaseCalculator calculator) {
        this.calculator = calculator;
    }

    public void showMenu() {
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
