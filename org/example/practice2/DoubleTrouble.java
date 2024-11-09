package org.example.practice2;

import java.util.Stack;

public class DoubleTrouble {
    public static void main(String[] args) {

        String s = "adebbecaacded";
        System.out.println(doubleTrouble(s));
    }

    private static String doubleTrouble(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (st.size() == 0 || ch != st.peek()) {
                st.push(ch);
            } else {
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (st.size() > 0) {
            sb.append(st.pop());

        }
        sb.reverse();
        return sb.toString();
    }
}
