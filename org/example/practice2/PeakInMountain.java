package org.example.practice2;

public class PeakInMountain {
    public static void main(String[] args) {
        /*
        * Example 1:
Input: arr = [0,1,0]
Output: 1
Example 2:
Input: arr = [0,2,1,0]
Output: 1
Example 3:
Input: arr = [0,10,5,2]

Output: 1*/
        int arr[]={0,1,0};
        int ele=findPeak(arr);
        System.out.println(ele);
    }

    private static int findPeak(int[] arr) {
        int n=arr.length;
        int l=0,h=n-1,mid=0;
        while(l<h)
        {
            mid=(l+h)/2;
            if(arr[mid]>arr[mid+1])
            {
                h=mid;
            }
            else
                l=mid+1;
        }
        return l;
    }
}
