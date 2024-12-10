package org.example.practice2;

public class SeggregatePositiveAndNegative {
    public static void main(String[] args) {
        int []input={-1,2,3,-5,4,8,-6};
        seggregatePositiveAndNegative(input);
    }

    private static void seggregatePositiveAndNegative(int[] input) {
        int n=input.length;
        int start=0,end=n-1;
        while(start<end)
        {
            if(input[start]<0 && input[end]>0)
            {
                int temp=input[start];
                input[start]=input[end];
                input[end]=temp;
                start++;
                end--;
            }
            else if(input[start]>0)
            {
                start++;
            }
            else if(input[end]<0)
            {
                end--;
            }
        }
        for(int num:input)
            System.out.print(num+" ");

    }
}
