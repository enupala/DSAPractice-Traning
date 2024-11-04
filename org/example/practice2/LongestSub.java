package org.example.practice2;

public class LongestSub {
    public static void main(String[] args) {

        String str = "aabbbbCCddd";
        String sub=longestSub(str);
        System.out.println(sub);

    }

    private static String longestSub(String str) {
        int maxLen=1;
        int start=0;
        int n=str.length();
        for(int i=0;i<n-1;i++)
        {
            int p1=i;
            int p2=i+1;
            int len=expandAroundTech(str,p1,p2);
            if(maxLen<len)
            {
                maxLen=len;
                start=i-(len-1)/2;
            }

        }
        System.out.println(start);

        return str.substring(start,start+maxLen);

    }

    private static int expandAroundTech(String str, int p1, int p2) {
        int n=str.length();
        while(p1>=0 && p2<n && str.charAt(p1)==str.charAt(p2))
        {
            p1--;
            p2++;
        }
        return p2-p1-1;
    }
}
