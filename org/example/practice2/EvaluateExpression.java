package org.example.practice2;

import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        String expression = "5 1 2 + 4 * + 3 -";
        int res=evaluateExpression(expression);
        System.out.println(res);
    }

    private static int evaluateExpression(String expression) {
        Stack<Integer>st=new Stack<>();
        String []chars=expression.split(" ");
        for(int i=0;i< chars.length;i++)
        {
            String s=chars[i];
           try
            {
                int val=Integer.parseInt(s);
                st.push(val);
            }
            catch(NumberFormatException n) {
                int val2=st.pop();
                int val1=st.pop();

                int res=0;
                switch (s)
                {
                    case "+":
                        res=val1+val2;
                        break;
                    case "-":
                        res=val1-val2;
                        break;
                    case "*":
                        res=val1*val2;
                        break;
                    case "/":
                        res=val1/val2;
                        break;

                }
                st.push(res);
            }

        }
        return st.pop();
    }

    /*private static boolean isNumeric(String s) {
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException e) {
            return false;
        }

    }*/
}
