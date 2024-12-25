package org.example.practice2;

public class CalculateMatrixSumNB {
    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //{1 3 5}
        // {5, 11,14}
        //{11, 20, 23}

        int[][] output = calculateMatrixSum(input);
        for(int i=0;i<output.length;i++)
        {
            for(int j=0;j<output[0].length;j++)
            {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
}



    private static int[][] calculateMatrixSum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int res[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                res[i][j]=mat[i][j];
                if(i>0)
                {
                    res[i][j]+=res[i-1][j];
                }
                if(j>0)
                {
                    res[i][j]+=res[i][j-1];
                }
                if(i>0 && j>0)
                {
                    res[i][j]-=res[i-1][j-1];
                }
            }
        }
        return res;


    }
    }
