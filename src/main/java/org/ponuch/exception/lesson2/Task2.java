package org.ponuch.exception.lesson2;

public class Task2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {1, 3, 6, 6, 3, 8, 9, 10, 12};
            int d = 1; // не понятно, что тут править и какова цель. если d = 0, то всегда будем попадать в catch. поставил d = 1
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
