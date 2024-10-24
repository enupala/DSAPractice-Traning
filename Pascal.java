package org.example.practice2;

import java.util.Arrays;

public class Pascal {
    public static void main(String[] args) {
        /*int []input={1};
        int[] res=getNextRow(input);*/
      /*  for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");*/
        printPascal(6);
    }

    private static void printPascal(int n) {
        int[] input ={1};
        System.out.println(Arrays.toString(input));
        for(int i=0;i<n;i++)
        {
            input=getNextRow(input);
            System.out.println(Arrays.toString(input));
        }

    }

    private static int[] getNextRow(int[] input) {
        int res[]=new int[input.length+1];
        for(int i=0;i<res.length;i++)
        {
            if(i==0)
                res[i]=input[0];
            else if(i== res.length-1)
            {
                res[i]=input[input.length-1];
            }
            else{
                res[i]=input[i-1]+input[i];
            }
        }
        return res;
    }
}
