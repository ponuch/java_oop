package org.ponuch.lesson6.model;

/**
 * Данные для вычисления арифметической операции
 * @param firstOperand
 * @param secondOperand
 */
public record OperationData(double firstOperand, double secondOperand, OperationType operationType) {
}
