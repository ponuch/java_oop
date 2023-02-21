package org.ponuch.lesson6.controller;

import org.ponuch.lesson6.model.OperationData;
import org.ponuch.lesson6.model.ResultData;

public interface BaseCalculator {
    ResultData calculate(OperationData operationData);
}
