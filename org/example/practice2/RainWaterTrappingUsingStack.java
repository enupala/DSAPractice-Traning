package org.example.practice2;

import java.util.Stack;

public class RainWaterTrappingUsingStack {
    public static void main(String args[]){
        int[]  height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(findingTrappingRainWater(height));

    }

    private static int findingTrappingRainWater(int[] height) {
        int water=0,m=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<height.length;i++)
        {
            while(!st.isEmpty() && height[i]>height[st.peek()]){
                m=st.pop();
                if(st.isEmpty())
                    break;
                int depth=Math.min(height[i],height[st.peek()])-height[m];
                int width=i-st.peek()-1;
                water+=depth*width;
            }
            st.push(i);
        }
        return water;
    }
}
