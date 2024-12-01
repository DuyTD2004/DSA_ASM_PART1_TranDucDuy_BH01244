package DataStructure.Algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 11, 55, 66, 77, 243, 15, 25, 615, 5, 75 };

        for (int step = 1; step < arr.length; step++) {
            int j = step - 1;
            int key = arr[step];
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }
}
