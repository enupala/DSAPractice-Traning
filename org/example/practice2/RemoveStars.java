package org.example.practice2;

import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {


        String s = "leet**cod*e";
        String res = removeStars(s);

        System.out.println(res);
        System.out.println(removeStarsUsingStack(s));
    }

    private static String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            if (ch == '*') {
                if(sb.length()>0) {
                    sb.deleteCharAt(sb.length()-1);
                }

            }
            else
            {
                sb.append(ch);
            }

        }

        return sb.toString();
    }
    private static String removeStarsUsingStack(String s) {
        Stack<Character>op=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='*' && op.size()>0)
            {
                op.pop();
            }
            else {
                op.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(op.size()!=0) {
            sb.append(op.pop());
        }
        sb.reverse();
        return sb.toString();

    }

}
