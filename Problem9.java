package org.example.practice2;

public class Problem9 {
    public static void main(String[] args) {
        /*
        * "Given a sentence/phrase and two words,
    return the minimum distance between the words.

Example:
    String str = “the quick the brown quick brown the frog”
    String word1 = “quick”
    String word2 = ""frog""

    //Return 2"
*/
        String str = "the quick the brown quick brown the frog";
        String word1 = "brown";
        String word2 = "frog";
        findMinDistance(str,word1,word2);
    }

    private static void findMinDistance(String str, String word1, String word2) {
        int wordindex1=-1;
        int wordindex2=-1;
        int n=str.length();
        int min=Integer.MAX_VALUE;
        String []s=str.split(" ");
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals(word1))
                wordindex1=i;
            else if(s[i].equals(word2))
                wordindex2=i;

            if(wordindex2!=-1 && wordindex1!=-1)
            min=Math.min(min,Math.abs(wordindex2-wordindex1)-1);
        }
        System.out.println(min);
    }

}
