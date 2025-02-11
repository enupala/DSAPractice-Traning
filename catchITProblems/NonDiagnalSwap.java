package catchITProblems;

public class NonDiagnalSwap {
    public static void main(String[] args) {
        int[][] matrix =  {{ 1,  2,  3,  4 },
                            { 5,  6,  7,  8 },
                            { 9, 10, 11, 12 },
                            {13, 14, 15, 16 }
    };
        swapNonDiagnalEle(matrix);

    }

    private static void swapNonDiagnalEle(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows!=cols)
            throw new IllegalArgumentException("matrix must be square");

        for(int i=0;i<rows;i++)
        {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][rows - 1 - i];
            matrix[i][rows - 1 - i] = temp;
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
