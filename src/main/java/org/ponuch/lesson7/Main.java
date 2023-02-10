package org.ponuch.lesson7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/**
 * Дана квадратная матрица, заполненная случайными числами.
 * Определите, сумма элементов каких строк превосходит сумму главной диагонали матрицы.
 */

public class Main {
    public static void main(String[] args) {
        int size = 4;
        int[][] arr = new int[size][size];

        Random random = new Random();
        // заполняем данные
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(arr));

        int mainSum = 0;
        for(int i = 0; i < size; i++) {
            mainSum += arr[i][i];
        }
        System.out.println("Main sum = %d".formatted(mainSum));

        //Определяем строки, сумма элементов которых превосходит сумму главной диагонали
        var lines = new HashMap<Integer, Integer>();
        for(int i = 0; i < size; i++) {
            int localSum = 0;
            for(int j = 0; j < size; j++) {
                localSum += arr[i][j];
                if (localSum > mainSum) {
                    lines.put(j, localSum);
                }
            }
        }

        System.out.println(lines);
    }
}
