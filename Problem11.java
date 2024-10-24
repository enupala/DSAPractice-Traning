package org.example.practice2;

public class Problem11 {
    public static void main(String[] args) {
        /*"Given a sorted rotated array,
    return the minimum element from it.

Examples:
    int[] arr1 = {5, 6, 1, 2, 3, 4};    //Return 1

    int[] arr2 = {1, 2, 3, 4};            //Return 1"
*/
        int[] arr1 = {5, 6, 2, 3, 4};
        checkMinEle(arr1);

    }

    private static void checkMinEle(int[] arr1) {
        int n = arr1.length;
        int min = Integer.MAX_VALUE;
        int l = 0;
        int h = n - 1;
        if (arr1[l] > arr1[h]) {
            while (l < h) {
                int m = (l + h) / 2;
                if (arr1[m] < arr1[h])
                    h = m - 1;
                else
                    l = m + 1;

                min = Math.min(min, arr1[m]);
            }
            System.out.println(min);
        } else
            System.out.println(arr1[0]);
    }
}
