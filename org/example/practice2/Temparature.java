package org.example.practice2;

import java.util.Stack;

public class Temparature {
    public static void main(String[] args) {

        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        int res[] = calculateWarmerDay(temp);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }
    }

    private static int[] calculateWarmerDay(int [] temperatures) {

            int n = temperatures.length;
            int[] answer = new int[n];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                // Check if current temperature is warmer than the day at the index on the top of the stack
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int j = stack.pop();
                    answer[j] = i - j;  // Calculate the difference in days
                }
                stack.push(i);  // Push the current day index onto the stack
            }

            return answer;
        }

    }

