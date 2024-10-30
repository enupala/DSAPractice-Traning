package org.example.practice2;

import java.util.Arrays;

public class Fibonacci {
   static int []strg;
    public static void main(String[] args) {
        solve();
    }

     static void solve() {
        int n=7;
         strg=new int[n+1];
         Arrays.fill(strg,-1);
        int res=fibanacci(n);
      System.out.println(res);
    }

    private static int fibanacci(int n) {

        if(n==0 || n==1) {
            strg[n]=n;
            return n;
        }
        if(strg[n]!=-1)
        {
            return strg[n];
        }

        int a=fibanacci(n-1);
        int b=fibanacci(n-2);
        strg[n]=a+b;
        return a+b;
    }
}
