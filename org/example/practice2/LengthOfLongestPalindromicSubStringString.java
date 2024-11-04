package org.example.practice2;

public class LengthOfLongestPalindromicSubStringString {
    public static void main(String[] args) {

        String s = "forgeeksskeegfor";
        String sub = lengthOfLongestPal(s);
        System.out.println(sub);
        System.out.println(sub.length());

    }

    private static String lengthOfLongestPal(String s) {
        int start=0;
        int n = s.length();
        int maxLen = 1;
        //for even
        for (int i = 0; i < n - 1; i++) {
            int p1 = i;
            int p2 = i + 1;
            int len = expandAround(s, p1, p2);
            if(maxLen<len) {
                maxLen=len;
                start = i - (len-1) / 2;
            }



        }

        // for odd
        for (int i = 1; i < n - 1; i++) {
            int p1 = i - 1;
            int p2 = i + 1;
            int len = expandAround(s, p1, p2);
            if(maxLen<len){
                maxLen=len;
                start = i - (len-1)/ 2;
            }


        }

        return s.substring(start,start+maxLen);
    }

    private static int expandAround(String s, int p1, int p2) {

        int n = s.length();
        while (p1 >= 0 && p2 < n && s.charAt(p1) == s.charAt(p2)) {
            
            p1--;
            p2++;
        }

        return p2 - p1 - 1;

    }


}
