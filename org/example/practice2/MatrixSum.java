package org.example.practice2;

public class MatrixSum {
    public static void main(String[] args) {
        int [][]mat={
                {10,10,2,0,20,4},
                {1,0,0,30,2,5},
                {0,10,4,0,2,0},
                {1,0,2,20,0,4}
        };
        int sum=calculateMaxSum(mat);
        System.out.println(sum);
    }

    private static int calculateMaxSum(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [][]dp=new int[m][n];
        dp[0][0]=mat[0][0];
        for(int i=1;i<m;i++)
        {
            dp[i][0]=mat[i][0]+dp[i-1][0];
        }

        for(int j=1;j<n;j++)
        {
            dp[0][j]=mat[0][j]+dp[0][j-1];
        }
        for(int i=1;i<m;i++)
        {

           for(int j=1;j<n;j++)
           {

            int  maxPrev=Math.max(dp[i-1][j],dp[i][j-1]);
               if(i>0 && j>0)
                   maxPrev=Math.max(dp[i-1][j-1],maxPrev);

               dp[i][j]=mat[i][j]+maxPrev;
           }
        }
        return dp[m-1][n-1];

    }
}
