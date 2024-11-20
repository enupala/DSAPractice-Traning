package org.example.practice2;

import java.util.HashMap;
import java.util.Stack;

public class CheckValidExpression {
    public static void main(String[] args) {

        //String s = "[(]";
        String s="(a+(b-c)+z)-z";
        boolean isBalanced = checkValidity(s);
        System.out.println(isBalanced);

    }

    private static boolean checkValidity(String s) {

        Stack<Character> st = new Stack<>();
        HashMap<Character,Character>map=new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

      for(char c: s.toCharArray())
      {
          if(c=='{' || c=='[' || c=='(')
          {
              st.push(c);
          }
           if(map.containsKey(c)){
               if(st.size()>0)
               {
                   if(st.peek()==map.get(c))
                   {
                       st.pop();
                   }
                   else
                       return false;
               }
               else
                   return false;
           }

      }
      return st.isEmpty();


    }
}
