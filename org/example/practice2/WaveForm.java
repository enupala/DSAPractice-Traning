package org.example.practice2;

public class WaveForm {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        int[] res = waveForm(arr);
        for (int i : res)
            System.out.print(i + " ");
    }

    private static int[] waveForm(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] < arr[i + 1]) {
                    swapValues(arr,i,i+1);

                }
            } else {
                if (arr[i + 1] < arr[i]) {
                    swapValues(arr,i,i+1);

                }
            }
        }
        return arr;
    }

    private static void swapValues(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
