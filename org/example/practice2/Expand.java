package org.example.practice2;

public class Expand {
    public static void main(String[] args) {

        String s = "forgeeksskeegfor";
        String sub = lengthOfLongestPal(s);
        System.out.print(sub);

    }
    private static String lengthOfLongestPal(String s) {
         //for even
        int n=s.length();
        int maxLen=1;
        int len=0,start=0;
        for(int i=0;i<n-1;i++)
        {
            int p1=i;
            int p2=i+1;
            len=expand(s,p1,p2);
            if(len>maxLen)
            {
             maxLen=len;
             start=i-(maxLen-1)/2;
            }
        }//for odd
        for(int i=1;i<n;i++)
        {
            int p1=i-1;
            int p2=i+1;
            len=expand(s,p1,p2);
            if(len>maxLen)
            {
                maxLen=len;
                start=i-(maxLen-1)/2;
            }
        }
        System.out.println(start);
        return s.substring(start,start+maxLen);

    }
    private static String lengthOfLongestPal1(String s) {

        int n=s.length();
        int maxLen=1,start=0,len=0;
        //for evn
        for(int i=0;i<n-1;i++)
        {
            int p1=i;
            int p2=i+1;
            len=expand(s,p1,p2);
           if(maxLen<len)
           {
               maxLen=len;
               start=i-(maxLen-1)/2;
           }

        }

        //for odd
        for(int i=1;i<n-1;i++)
        {
            int p1=i-1;
            int p2=i+1;
             len=expand(s,p1,p2);
            if(maxLen<len)
            {
                maxLen=len;
                start=i-(maxLen-1)/2;
            }
        }
        System.out.println(start);
        return s.substring(start,start+maxLen);
    }

    private static int expand(String s, int p1, int p2) {
        int n=s.length();
        while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2))
        {
            p1--;
            p2++;
        }
        return p2-p1-1;
    }
}
