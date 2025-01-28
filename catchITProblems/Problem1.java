package catchITProblems;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 7};
       // int result = addSecondSmallestAndLargest(arr);
        int res=optimised(arr);
        System.out.println(res);
       // System.out.println(result);
    }

    private static int optimised(int[] arr) {
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num : arr)
        {
            if(num<smallest)
            {

                secondSmallest=smallest;
                smallest=num;
            }
            else if(num<secondSmallest && num!=smallest)
            {
                secondSmallest=num;
            }
            if(num>largest)
            {
                secondLargest=largest;
                largest=num;

            }
            else if(num>secondLargest && num!=largest)
            {
                secondLargest=num;
            }
        }
        return secondSmallest+secondLargest;
    }

    private static int addSecondSmallestAndLargest(int[] arr) {
        Arrays.sort(arr);
        int secSmall=arr[1];
        int secLarg=arr[arr.length-2];
        return secSmall+secLarg;
    }
}
