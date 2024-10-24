package org.example.practice2;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
      String  s = "abccccdd";
    int len=  longestPalindrom(s);
        System.out.println(len);
    }

    private static int longestPalindrom(String s) {
        int n=s.length();
        int count=0;
        boolean isOdd=false;
        HashMap<Character,Integer>fmap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(fmap.containsKey(ch))
            {
                fmap.put(ch,fmap.get(ch)+1);
            }
            else
                fmap.put(ch,1);
        }
        for(Map.Entry<Character,Integer>entry : fmap.entrySet())
        {
            if(entry.getValue()%2==0)
                count+= entry.getValue();
            else{
                count+= entry.getValue()-1;
                isOdd=true;
            }

        }
        if(isOdd)
            count+=1;

        return count;

    }


}
