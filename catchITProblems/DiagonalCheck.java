package catchITProblems;

public class DiagonalCheck {
    public static void main(String[] args) {
        int mat[][]={
                {1,0,0},
                {0,1,0},
                {0,0,3}
        };
        Boolean flag=checkValidDigonalMat(mat);
        System.out.println(flag);
    }

    private static Boolean checkValidDigonalMat(int[][] mat) {
        boolean flag=true;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(i!=j && mat[i][j]!=0)
                {
                    flag=false;
                    break;
                }
            }
            if(!flag)
            {
                break;
            }
        }
        return flag;
    }
}
