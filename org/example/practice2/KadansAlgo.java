package org.example.practice2;

public class KadansAlgo {
    public static void main(String[] args) {
        int arr[]={-3,2,4,-1,3,-4,3};
        int maxSum=maxSubArraySum(arr);
        System.out.println(maxSum);
    }

    private static int maxSubArraySum(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int sum=0,start=0,maxStart=0,maxEnd=0;
        for(int i=0;i<n;i++)
        {
            if(sum>0)
            {
                sum+=arr[i];
            }
            else{
                sum=arr[i];
                start=i;
            }
            if(max<sum)
            {
                max=sum;
                maxStart=start;
                maxEnd=i;
            }
        }
        System.out.println("start index : "+maxStart);
        System.out.println("end index : "+maxEnd);
        return max;
    }
}
