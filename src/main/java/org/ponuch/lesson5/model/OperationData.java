package org.ponuch.lesson5.model;

/**
 * Данные для вычисления арифметической операции
 * @param firstOperand
 * @param secondOperand
 */
public record OperationData(double firstOperand, double secondOperand, OperationType operationType) {
}
