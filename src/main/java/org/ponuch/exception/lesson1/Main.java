package org.ponuch.exception.lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr1 = {1, 3, 2, 56, -23, 86};
        int[] arr2 = {3, 6, 2, 8, 78, 4};
        var res = main.createDiff(arr1, arr2);
        var res2 = main.createDiff2(arr1, arr2);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res2));

        Integer[] arr3 = {2, 8, 9, 34, -23, null};
        main.checkArray(arr3);
    }

    public void checkArray(Integer[] array) {
        if (array == null) {
            throw new RuntimeException("Массив не может быть null reference");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Длина массива не может быть 0");
        }
        for (Integer item : array) {
            if (item == null) {
                throw new NullPointerException("Элемент массива не может быть null");
            }
        }
    }

    public int[] createDiff(int[] firstArr, int[] secondArr) {
        checkArrays(firstArr, secondArr);
        int[] result = new  int[firstArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            result[i] = firstArr[i] - secondArr[i];
        }

        return result;
    }

    public float[] createDiff2(int[] firstArr, int[] secondArr) {
        checkArrays(firstArr, secondArr);
        float[] result = new  float[firstArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            result[i] = (float)firstArr[i] /  (float)secondArr[i];
        }

        return result;
    }

    private void checkArrays(int[] firstArr, int[] secondArr) {
        if(firstArr.length != secondArr.length) {
            throw new IllegalArgumentException("Массивы имеют разную длину, обработка невозможна");
        }
    }
}
