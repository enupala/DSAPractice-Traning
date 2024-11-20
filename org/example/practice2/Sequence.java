package org.example.practice2;

public class Sequence {
    public static void main(String[] args) {
       int [] nums = {20, 100, 10, 12, 5, 13};
        System.out.println(validTriplet(nums));;
    }

    private static boolean validTriplet(int[] nums) {
        int n=nums.length;
        int firstMin=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<=firstMin)
            {
                firstMin=nums[i];
            }
            else if(nums[i]<=secondMin)
            {
                secondMin=nums[i];
            }
            else {
                return true;
            }
        }
        return false;
    }
}
