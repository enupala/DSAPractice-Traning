package catchITProblems;

public class MergeSort {
    public static void main(String[] args) {

    int arr[]={25,12,50,20,15,30};
    int []mergeSortedArr=mergeSort(arr,0,arr.length-1);
    for(int i=0;i<mergeSortedArr.length;i++)
        System.out.print(mergeSortedArr[i]+ " ");
    }

    private static int[] mergeSort(int[] arr, int low, int high) {
        if(low == high)
        {
            int []baseArr=new int[1];
            baseArr[0]=arr[low];
            return baseArr;

        }
        int mid=(low+high)/2;
        int []leftArr=mergeSort(arr,low,mid);
        int []rightArr=mergeSort(arr,mid+1,high);
        return mergeAndSortedArray(leftArr,rightArr);
    }

    private static int[] mergeAndSortedArray(int[] leftArr, int[] rightArr) {
        int n1=leftArr.length;
        int n2=rightArr.length;
        int res[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(leftArr[i]<rightArr[j])
            {
                res[k]=leftArr[i];
                i++;
                k++;
            }
            else{
                res[k]=rightArr[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            res[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<n2){
            res[k]=rightArr[j];
            j++;
            k++;
        }
        return res;
    }

}