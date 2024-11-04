package org.example.practice2;

public class MaxPathSum {
    static int[][] strg;
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {

      /* int[][] A ={
               {10,10,2,0,20,4},
               {1,0,0,30,2,5},
               {0,10,4,0,2,0},
               {1,0,2,20,0,4}
       };*/
        int [][]A={
                {2,1},
                {30,5}
        };
       int n=A.length;
       int m=A[0].length;
       strg=new int[n][m];
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               strg[i][j]=-1;
           }
       }
        System.out.println(helper(A,n-1,m-1));



    }

    private static int helper(int[][] A, int i, int j) {
        if(i<0 || j<0)
        {
            /*return Integer.MIN_VALUE;*/
            return Integer.MAX_VALUE;
        }

        if(i==0 && j==0)
        {
            return strg[i][j]=A[i][j];
        }

        if(strg[i][j]!=-1)
        {
            return strg[i][j];
        }
        int a=helper(A,i-1,j);
        int b=helper(A,i,j-1);

        return strg[i][j]=Math.min(a,b)+A[i][j];

    }
}
