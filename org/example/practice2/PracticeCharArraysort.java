package org.example.practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeCharArraysort {
    public static void main(String[] args) {
        String s = "saaatbbbb";//bbbbaaast
        char[] arr = s.toCharArray();
        String sortedString=sortArrayUsingMap(arr);
        System.out.println(sortedString);
        //char[] arr = s.toCharArray();
        //sortCharArray(arr);
    }

    private static String sortArrayUsingMap(char[] arr) {
        int n=arr.length;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=arr[i];
            if(map.containsKey(ch))
            {
               map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        //System.out.println(map);
        List<Map.Entry<Character,Integer>> entryList=new ArrayList<>(map.entrySet());
        entryList.sort((entry1,entry2)->{
            int comp=entry2.getValue().compareTo(entry1.getValue());
            if(comp==0)
            {
                return entry1.getKey().compareTo(entry2.getKey());
            }
            return comp;
        });
        StringBuilder sb=new StringBuilder();
       for(Map.Entry<Character,Integer>entry: entryList)
       {
           int freq=entry.getValue();
           char ch=entry.getKey();
           sb.append(String.valueOf(ch).repeat(freq));
       }

    return sb.toString();

    }

    private static void sortCharArray(char[] arr) {
        int n=arr.length;
        int fmap[]=new int[26];
        for(int i=0;i<n;i++)
        {
            char ch=arr[i];
            int indx=ch-'a';
            fmap[indx]++;
        }
        int k=0;

        for(int i=0;i<26;i++)
        {
            int freq=fmap[i];
            char val=(char)('a'+i);
            while(freq!=0) {
                arr[k]=val;
                k++;
                freq--;
            }


        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
