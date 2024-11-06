package org.example.practice2;

import java.util.HashSet;

public class LongestSubstringDistinctEle {
    public static void main(String[] args) {
        String s="abgbhrtbc";
        int len=longSubStringDist(s);
        int opt=longSubStringDistOpt(s);
        System.out.println(len);
        System.out.println(opt);
    }

    private static int longSubStringDistOpt(String s) {
        int n=s.length();
        int start=0, end =0;
        int max=0;
        HashSet<Character>set=new HashSet<>();
        while(end<n)
        {
            if(set.contains(s.charAt(end))==false)
            {
                set.add(s.charAt(end));
                end++;
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
            max=Math.max(max,set.size());
        }
        return max;
    }

    private static int longSubStringDist(String str) {
        int ans=0;
        int n=str.length();
        for(int s=0;s<n;s++)
        {
            HashSet<Character>set=new HashSet<>();
            for(int e=s;e<n;e++)
            {
                if(set.contains(str.charAt(e)))
                {
                    break;
                }
                else{
                    set.add(str.charAt(e));
                }
            }
            ans=Math.max(ans,set.size());

        }
        return  ans;
    }
}
