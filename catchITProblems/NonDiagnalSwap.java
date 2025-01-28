package catchITProblems;

public class NonDiagnalSwap {
    public static void main(String[] args) {
        int[][] matrix = {  {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9} };
        swapNonDiagnalEle(matrix);

    }

    private static void swapNonDiagnalEle(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows!=cols)
            throw new IllegalArgumentException("matrix must be square");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(i==j || i+j==rows-1 )
                {continue;}


                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[rows-i-1][cols-j-1];
                    matrix[rows-i-1][cols-j-1]=temp;


                /*else if (i==j)
                    continue;*/
            }
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
