package DataStructure.Algorithm;

import java.util.Arrays;

import DataStructure.Array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 16666, 2221, 455, 5, 66, 7, 8, 99 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.println("Sorted array:" + Arrays.toString(arr));
        }        
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
