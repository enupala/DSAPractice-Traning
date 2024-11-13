package org.example.practice2;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String s="{([])}";
        boolean isBalanced=checkBalance(s);
        System.out.println(isBalanced);

    }

    private static boolean checkBalance(String s) {
        Stack<Character>op=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           if(op.size()==0)
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
           else{
               op.push(ch);
           }
        }
        if(op.size()==0)
            return true;
        else
            return false;
    }
}
