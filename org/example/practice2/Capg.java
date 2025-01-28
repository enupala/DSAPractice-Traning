package org.example.practice2;

import java.util.HashMap;
import java.util.Map;

public class Capg {
    public static void main(String[] args) {
        String s= "aabbbbbcc";
        longString(s);
    }

    private static void longString(String s) {
        int max=Integer.MIN_VALUE;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        char c='0';
        for(Map.Entry<Character,Integer>entry : map.entrySet()){
            if(max<entry.getValue())
            {
                max=entry.getValue();
                c=entry.getKey();
            }
        }
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            if(c==s.charAt(i)){
                index=i;
                break;
            }

        }
        System.out.println("max occ is : "+max +" , char is : "+c+" at index is : "+index);
    }
}
