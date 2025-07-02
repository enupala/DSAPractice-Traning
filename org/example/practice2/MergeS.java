package org.example.practice2;

public class MergeS {
    public static void main(String[] args) {
        int arr[]={25,12,50,20,15,30};
        int mergeSortedArray[]=mergeSort(arr,0,arr.length-1);
        for(int i=0;i<mergeSortedArray.length;i++)
        {
            System.out.print(mergeSortedArray[i]+" ");
        }
    }

    private static int[] mergeSort(int[] arr,int low,int high) {

        if(low==high)
        {
            int baseArr[]=new int[1];
            baseArr[0]=arr[low];
            return  baseArr;
        }
        int mid=(low+high)/2;
        int leftArr[]=mergeSort(arr,low,mid);
        int rightArr[]=mergeSort(arr,mid+1,high);
        return mergedSortedArray(leftArr,rightArr);

    }

    private static int[] mergedSortedArray(int[] leftArr, int[] rightArr) {
        int n1=leftArr.length;
        int n2=rightArr.length;
        int res[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(leftArr[i]<rightArr[j])
            {
                res[k]=leftArr[i];
                k++;
                i++;
            }
            else
            {
                res[k]=rightArr[j];
                k++;
                j++;
            }
        }
        while(i<n1)
        {
            res[k]=leftArr[i];
            k++;
            i++;

        }
        while(j<n2)
        {
            res[k]=rightArr[j];
            k++;
            j++;

        }
        return  res;
    }
}
