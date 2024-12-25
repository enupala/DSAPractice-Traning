package org.example.practice2;

import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        // HashMap to store the difference and its index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current element
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Add the current element and its index to the map
            map.put(nums[i], i);
        }
        // Return an empty array if no solution is found
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 8, 9, -2};
        int target = 7;

        int[] result = findTwoSum(a, target);

        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
