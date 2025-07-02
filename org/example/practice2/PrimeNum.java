package org.example.practice2;

import java.util.ArrayList;

class PrimeNum {
    public static void main(String[] args) {
        int arr[]={2,3,7,97,67,78,45};

        int primeArr[]=filterPrimeNums(arr);
        for(int i=0;i<primeArr.length;i++)
            System.out.print(primeArr[i]+" ");
    }
    public static int[] filterPrimeNums(int []arr)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]))
            {
                list.add(arr[i]);
            }
        }
        int res[]=new int[list.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
    public static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        if(n==2)
            return true;
        for(int i=3;i<Math.sqrt(n);i+=2)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
