package catchITProblems;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[]={20,5,15,25,10,8};
        //after sorting the arr: 5,8,10,15,20,25
        int res[]=sortArray(arr);

        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
        System.out.println();
        int sumOfSecSmallAndSecLarVal=sumOfSecSamllAndSecLarUsingStreams(arr);
        System.out.println(sumOfSecSmallAndSecLarVal);
    }
    private static  int sumOfSecSamllAndSecLarUsingStreams(int []arr)
    {
        int secSmallest= Arrays.stream(arr)
                .sorted().distinct().skip(1).findFirst().orElse(Integer.MIN_VALUE);
        int secLargest=Arrays.stream(arr).boxed().sorted((a,b)->(b-a)).distinct().skip(1)
                .findFirst().orElse(Integer.MAX_VALUE);
        return secLargest+secSmallest;
    }

    private static int secSmaAndSecLar(int[] res) {
        return res[1]+res[res.length-2];
    }

    private static int[] sortArray(int[] arr) {
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
