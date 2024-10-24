package org.example.practice2;

public class Problem2 {
    public static void main(String[] args) {
        /*
        * "Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.

Example:
String[] dict = {""CODGE"", ""ODG"", ""LODGES"", ""SODG"", ""dodge"", ""mODJ"", ""LODGESSSS""}
String toSearch = ""ODG"";

//Returns 9 (LODGESSSS)"
*/
   String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
   String toSearch = "ODG";
   checkLongestSubString(dict,toSearch);
    }

    private static void checkLongestSubString(String[] dict, String toSearch) {
        int max=Integer.MIN_VALUE;
        int n= dict.length;
        for(int i=0;i<n;i++)
        {
            String s=dict[i];
            if(s.contains(toSearch))
              max=Math.max(max,s.length());
        }
        System.out.println(max);
    }
}
