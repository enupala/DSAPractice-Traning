package org.example.practice2;


public class Problem5 {
    public static void main(String[] args) {
        /*
        * "Find the median of two sorted arrays of different sizes.

Example:
arr1[] = {2, 3, 5, 8}
arr2[] = {10, 12, 14, 16, 18, 20}

//Return 11 as the median"
*/
       int arr1[] = {2, 3, 5, 8,9};
       int arr2[] = {10, 12, 14, 16, 18, 20};
    int res[]=   mergeAndFindMedian(arr1,arr2);
      int median= calculateMedian(res);
        System.out.println("median of 2 arrays is : "+median);
    }

    private static int calculateMedian(int[] res) {
        int n=res.length;
        int med=0;
        if(n%2==0)
        {
            med=(res[n/2-1]+res[n/2])/2;
        }
        else
            med=res[n/2];
        return med;
    }

    private static int[] mergeAndFindMedian(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0,j=0,k=0;
        int res[]=new int[n1+n2];
        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j])
            {
                res[k]=arr1[i];
                i++;
                k++;
            }
            else{
                res[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            res[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            res[k]=arr2[j];
            j++;
            k++;
        }

        return res;
    }
}
