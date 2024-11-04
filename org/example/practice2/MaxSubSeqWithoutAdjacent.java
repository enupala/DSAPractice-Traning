package org.example.practice2;

import java.util.Arrays;

public class MaxSubSeqWithoutAdjacent {
    static int []strg;
    public static void main(String[] args) {
        int[] A ={-2,7,3,5};
        strg=new int[A.length];
        Arrays.fill(strg,-1);
       int sum= calculateMaxSum(A,A.length-1);
        System.out.println(sum);
    }

    private static int calculateMaxSum(int[] A, int i) {
        int maxSum=Integer.MIN_VALUE;
        if(i<0)
        {
            return 0;
        }
        if(strg[i]!=-1)
        {
            return strg[i];

        }
        int a=calculateMaxSum(A,i-2);
        int b=calculateMaxSum(A,i-1);
        maxSum=Math.max(a+A[i],b);
        strg[i]=maxSum;
        return strg[i];

    }
}
