package org.example.practice2;

public class LengthOfLongestPalindromicSubString {
    public static void main(String[] args) {

        String s = "forgeeksskeegfor";
        int len = lengthOfLongestPal(s);
        System.out.println(len);

    }

    private static int lengthOfLongestPal(String s) {

        int n = s.length();
        int ans = 1;
        //for even
        for (int i = 0; i < n - 1; i++) {
            int p1 = i;
            int p2 = i + 1;
            ans = Math.max(expandAround(s, p1, p2), ans);
        }
        // for odd
        for (int i = 1; i < n - 1; i++) {
            int p1 = i - 1;
            int p2 = i + 1;
            ans = Math.max(expandAround(s, p1, p2), ans);
        }
        return ans;

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
