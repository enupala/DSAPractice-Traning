package org.example.practice2;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[]arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] lmax =leftMax(arr);
        for(int i=0;i<lmax.length;i++)
            System.out.print(lmax[i]+" ");
        System.out.println();
        int[] rmax =rmax(arr);
        for(int i=0;i<rmax.length;i++)
            System.out.print(rmax[i]+" ");

        int water=rainWaterTapping(arr);
        System.out.println();
        System.out.println("amnt is  "+water);
    }

    private static int rainWaterTapping(int[] arr) {
        int[] lmax =leftMax(arr);
        int[] rmax =rmax(arr);
        int waterAmount=0;
        for(int i=0;i<arr.length;i++)
        {
            waterAmount+=Math.min(lmax[i],rmax[i])-arr[i];
        }
        return waterAmount;
    }

    private static int[] rmax(int[] arr) {
        int n=arr.length;
        int rmax[]=new int[n];
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        return rmax;
    }

    private static int[] leftMax(int[] arr) {
        int n=arr.length;
        int lmax[]=new int[n];
        lmax[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            lmax[i]=Math.max(lmax[i-1],arr[i]);
        }
        return lmax;
    }
}
