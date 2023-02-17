package org.ponuch.lesson5.controller;

import org.ponuch.lesson5.model.OperationData;
import org.ponuch.lesson5.model.ResultData;

public class Calculator {
    public ResultData calculate(OperationData operationData) {

        var result = switch (operationData.operationType()) {
            case ADD -> operationData.firstOperand() + operationData.secondOperand();
            case SUB -> operationData.firstOperand() - operationData.secondOperand();
            case MUL -> operationData.firstOperand() * operationData.secondOperand();
            case DIV -> operationData.firstOperand() / operationData.secondOperand();
        };
        return new ResultData(result);
    }
}
