package org.example.practice2;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[] = {2, 3, -1, 4, 5, 1};
        int k = 3;
        int max = maxSubarraySum(arr, k);
        System.out.println(max);
    }

    private static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;
        int s = 1, e = k;//sliding window technique
        while (e < n) {

            sum = sum + arr[e] - arr[s - 1];
            if (max < sum)
                max = sum;
            s++;
            e++;

        }
        return max;
    }
}
