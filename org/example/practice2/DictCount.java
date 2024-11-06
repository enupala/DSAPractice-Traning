package org.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;

public class DictCount {
    public static void main(String[] args) {
        String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
        String input = "caab";
       String[] arr = dictCount(dict,input);
       for(String s:arr)
           System.out.print(s+" ");
    }

    private static String[] dictCount(String[] dict, String input) {
        ArrayList<String>list=new ArrayList<>();
        int n=dict.length;

        int[] freInput =new int[26];
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            int indx=ch-'a';
            freInput[indx]++;
        }

        for(int i=0;i<n;i++)
        {
            String s=dict[i];
            if(s.length()==input.length())
            {
               int []freEle=new int[26];
                for(int j=0;j<s.length();j++)
                {
                    char ch=s.charAt(j);
                    int ind=ch-'a';
                    freEle[ind]++;
                }
                if(Arrays.equals(freInput,freEle)){
                    list.add(s);

                }


            }
        }
        return list.toArray(new String[0]);
    }
}
