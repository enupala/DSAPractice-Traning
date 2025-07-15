package org.example.practice2;

public class ContainerWithMostWater {
    public static void main(String[] args) {
       int [] height = {1,8,6,2,5,4,8,3,7};
       int maxWater=calculateMaxWater(height);
        System.out.println(maxWater);
    }

    private static int calculateMaxWater(int[] height) {
        int n=height.length;
        int left=0,right=n-1,max=0,area=0;
        while(left<right)
        {
            area=Math.min(height[left],height[right])*(right-left);
            max=Math.max(max,area);
            if(height[left]<height[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
