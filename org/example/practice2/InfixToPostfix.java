package org.example.practice2;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix="x^y/(a+b*c-d)-e+f*g-h";
        System.out.println(covertInfixToPostfix(infix));
    }

    private static String covertInfixToPostfix(String infix) {
        Stack<String>exp=new Stack<>();
        Stack<Character>op=new Stack<>();

        for(int i=0;i<infix.length();i++)
        {
            char ch=infix.charAt(i);
            if(ch>='a' && ch<='z')
            {
                exp.push(ch+"");
            }
            else if(ch=='(')
            {
                op.push(ch);
            }
            else if (ch==')')
            {
                while(op.peek()!='(') {
                    String val2 = exp.pop();
                    String val1 = exp.pop();
                    char operator = op.pop();
                    exp.push(val1 + val2 + operator);
                }
                op.pop();

            }
            else{
                if(op.size()==0 || op.peek()=='(')
                {
                    op.push(ch);
                }
                else{
                    while(op.size()>0 && priority(op.peek())>=priority(ch))
                    {
                        String val2=exp.pop();
                        String val1=exp.pop();
                        char operator=op.pop();
                        exp.push(val1+val2+operator);
                    }
                    op.push(ch);

                }
            }


        }
        while(op.size()>0)
        {
            String val2=exp.pop();
            String val1=exp.pop();
            char operator=op.pop();
            exp.push(val1+val2+operator);
        }
        return exp.pop();
    }

    private static int priority(Character c) {
        if(c=='^')
        {
            return 3;
        }
        else if(c=='+' || c=='-')
        {
            return 1;
        }
        else if (c=='*'||c=='/')
        {
            return 2;
        }
        else
        {
            return -1;
        }
    }
}
