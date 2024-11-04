package org.example.practice2;

import java.util.Arrays;

public class StairCase {
    static int[] strg;
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int n=5;
        strg=new int[n+1];
        Arrays.fill(strg,-1);
        int ways=calculateWays(n);
        System.out.println(ways);
    }

    private static int calculateWays(int n) {
        if(n==1 || n==2) {
            strg[n]=n;
            return strg[n];
        }
        if(strg[n]!=-1)
        {
            return strg[n];
        }
        int way1=calculateWays(n-1);
        int way2=calculateWays(n-2);
        strg[n]=way1+way2;
        return strg[n];
    }
}
