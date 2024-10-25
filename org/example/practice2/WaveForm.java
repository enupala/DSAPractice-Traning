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
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
