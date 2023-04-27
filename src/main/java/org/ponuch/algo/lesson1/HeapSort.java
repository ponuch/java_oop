package org.ponuch.algo.lesson1;

import java.util.Arrays;

public class HeapSort {
    private void heapify(int[] arr, int size, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != index) {
            int swap = arr[index];
            arr[index] = arr[largest];
            arr[largest] = swap;

            heapify(arr, size, largest);
        }


    }

    public void sort(int[] arr) {
        int size = arr.length;

        //Build the heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }

        for (int i = size - 1; i >= 0 ; i--) {
            //move current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 34, -2, 8, 39, -56, 18 };
        System.out.println("Array before sort = " + Arrays.toString(arr));
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        System.out.println("Sorted array = " + Arrays.toString(arr));
    }
}
