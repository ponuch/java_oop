package org.ponuch.lesson5;

import org.ponuch.lesson5.controller.Calculator;
import org.ponuch.lesson5.view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculatorView calculatorView = new CalculatorView(new Calculator());
        calculatorView.printMenu();
    }
}
