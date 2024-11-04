/*
package org.example.practice2;

public class ShortestSubarrayLength {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 2, 1};
        int K = 12;
       int length= shortestSubarrayLength(arr,K);
        System.out.println(length);
    }

    private static int shortestSubarrayLength(int[] arr, int val) {
        int n=arr.length;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int k=0;k<n;k++)
        {
            sum+=arr[k];
        }
        for(int i=1;i<n-1;i++)
        {
            sum+=arr[i+1]-arr[i-1];
        }

    }
}
*/
