package org.example.practice2;

import java.util.Arrays;

public class Fibonacci {
 static int strg[];

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int n=7;
        strg=new int[n+1];
        Arrays.fill(strg,-1);
       int res= fib(n);
        System.out.println(res);
    }

    private static int fib(int n) {

        if(n==0 || n==1){
            strg[n]=n;
            return strg[n];}
            if(strg[n]!=-1)
            {
                return strg[n];
            }
            int a=fib(n-1);
            int b=fib(n-2);
            strg[n]=a+b;
            return strg[n];
    }
}
