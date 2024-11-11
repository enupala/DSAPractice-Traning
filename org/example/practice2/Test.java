package org.example.practice2;/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Test {
    public static void main(String[] args) {
    /*
   "Given a dictionary (list of words) and a word,
    return an array of strings that can be formed from the given word.
    [Every letter in the input word can occur only once in the word to be returned].

Examples:
    String[] dict = {""ab"", ""abcd"", ""bcdaf"", ""bcad"", ""acb"", ""acab""};
    String input = ""abcd"";
    // Return {""abcd"", ""bcad""}

    String[] dict =  {""ab"", ""abcd"", ""bcdaf"", ""bcad"", ""acaab"", ""acab""};
    String input = ""caab"";
    // Return {""acab""}"


    */
        String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input = "abcd";
        String []res=calculateStringPermutations(dict,input);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]+" ");

    }

    private static String[] calculateStringPermutations(String[] dict, String input) {
        int freqInput[]=new int[26];
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            int indx=ch-'a';
            freqInput[indx]++;
        }

        for(int i=0;i<dict.length;i++)
        {
            String s1=dict[i];
            if(s1.length()!=input.length())
            {
                continue;
            }
           else if(s1.length()==input.length()){
                int freqEle[]=new int[26];
                for(int j=0;j<s1.length();j++)
                {
                    char ch=s1.charAt(j);
                    int indx=ch-'a';
                    freqEle[indx]++;
                }
                if(Arrays.equals(freqInput, freqEle))
                {
                    list.add(s1);
                }

            }


        }
        return list.toArray(new String[0]);
    }
}
