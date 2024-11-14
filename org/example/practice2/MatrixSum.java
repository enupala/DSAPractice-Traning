package org.example.practice2;

public class MatrixSum {
    public static void main(String[] args) {
        int [][]mat={
                {10, 10, 2, 0, 20, 4},
                {1,   0, 0, 30, 2, 5},
                {0, 10, 4, 0, 2, 0},
                {1, 0, 2, 20, 0, 4}

        };
        int sum=calculateMaxSum(mat);
        System.out.println(sum);
    }

    private static int calculateMaxSum(int[][] matrix) {


       int n=matrix.length;
       int m=matrix[0].length;
        int[][] dp =new int[n][m];
       for(int j=0;j<m;j++)
       {
           dp[0][j]=matrix[0][j];
       }

       for(int i=1;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               //up
               dp[i][j]=dp[i-1][j]+matrix[i][j];
               //top left diagonal
               if(j>0)
               {
                   dp[i][j]=Math.max(dp[i][j],dp[i-1][j-1]+matrix[i][j]);
               }
               //top right diagonal
               if(j<m-1)
               {
                   dp[i][j]=Math.max(dp[i][j],dp[i-1][j+1]+matrix[i][j]);
               }
           }
       }
       int max=Integer.MIN_VALUE;
       for(int j=0;j<m;j++)
       {
           max=Math.max(max,dp[n-1][j]);
       }
       return max;
    }


        }

