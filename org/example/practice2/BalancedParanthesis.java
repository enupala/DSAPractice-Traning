package org.example.practice2;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        //String s="({[(]})";
       String s="(a+(b-c)+z)-z";
        boolean isBalanced=checkBalance(s);
        System.out.println(isBalanced);

    }
    private static boolean checkBalance(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
            {
                st.push(ch);
            }
            else if(ch=='}' && st.peek()=='{')
                st.pop();
            else if(ch==']' && st.peek()=='[')
                st.pop();
            else if(ch==')' && st.peek()=='(')
                st.pop();


        }
        return st.isEmpty();

    }

    private static boolean checkBalance1(String s) {
        Stack<Character>op=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);

            if(ch=='{' || ch=='(' || ch=='[')
           {
               op.push(ch);
           }
           else if(ch==')' && op.peek()=='(')
           {
               op.pop();
           }
           else if(ch=='}' && op.peek()=='{')
           {
               op.pop();
           }
           else if(ch==']' && op.peek()=='[')
           {
               op.pop();
           }

        }


            return op.isEmpty();
    }
}
