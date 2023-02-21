package org.ponuch.lesson6;

import org.ponuch.lesson6.controller.SimpleCalculator;
import org.ponuch.lesson6.view.BaseView;
import org.ponuch.lesson6.view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        BaseView calculatorView = new CalculatorView(new SimpleCalculator());
        calculatorView.showMenu();
    }
}
