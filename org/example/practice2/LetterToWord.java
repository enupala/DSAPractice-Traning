package org.example.practice2;

import java.util.*;

public class LetterToWord {
   public static final HashMap<Character,String> map=new HashMap<>();
    public static void main(String[] args) {

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        map.put('1',"1");
        map.put('0',"0");
        String digits="23";

       List<String>list= stringCombinations(digits);
       for(int i=0;i<list.size();i++)
           System.out.print(list.get(i)+" ");

    }

    private static List<String> stringCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
        ArrayList<String>list=new ArrayList<>();
        Queue<String>q=new ArrayDeque<>();
        q.offer("");
        for(char ch : digits.toCharArray())
        {
            String letters=map.get(ch);
            int size=q.size();
            for(int j=0;j<size;j++)
            {
                String curr=q.poll();
                for(char c: letters.toCharArray())
                {
                    q.offer(curr+c);
                }
            }
        }
        list.addAll(q);
        return list;
    }


}
