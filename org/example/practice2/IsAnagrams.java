package org.example.practice2;

import java.util.HashMap;
import java.util.Map;

public class IsAnagrams {
    public static void main(String[] args) {
        String A="aabbddcc";
        String B="bbccddaa";
        System.out.println(isAngrams(A,B));
    }

    private static boolean isAngrams(String A, String B) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();

        generateFreqMap(map1,A);
        generateFreqMap(map2,B);

        return isMapEquals(map1,map2);
    }

    private static boolean isMapEquals(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
        if(map1.size()!=map2.size())
            return false;
        int f1=0,f2=0;

        for(char ch='a';ch<='z';ch++)
        {
            if(map1.containsKey(ch))
            {
                 f1=map1.get(ch);
            }
            if(map2.containsKey(ch))
            {
                 f2=map2.get(ch);
            }
            if(f1!=f2)
                return false;
        }
        return true;
    }

    private static void generateFreqMap(HashMap<Character, Integer> map1, String a) {
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(map1.containsKey(ch))
            {
                map1.put(ch,map1.get(ch)+1);
            }
            else
            {
                map1.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry: map1.entrySet())
            System.out.print(entry.getKey()+"-> "+entry.getValue()+" ");
        System.out.println();
    }
}
