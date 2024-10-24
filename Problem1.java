package org.example.practice2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {
       /* "Convert a string as given in the format below:

        Example:
        aabbb into a2b3
        aaaa into a4
        a into a1"*/
        String s="aabbbacb";
        appendCount(s);


    }

    private static void appendCount(String s) {
        LinkedHashMap<Character,Integer>lmap=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(lmap.containsKey(ch))
            {
                lmap.put(ch,lmap.get(ch)+1);
            }
            else
                lmap.put(ch,1);
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer>entry : lmap.entrySet())
        {
            sb.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(sb.toString());
    }
}
