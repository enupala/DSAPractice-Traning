package org.example.practice2;

public class RemoveStars {
    public static void main(String[] args) {


        String s = "erase*****";
        String res = removeStars(s);
        System.out.println(res);
    }

    private static String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            if (ch == '*') {
                if(sb.length()>0) {
                    sb.deleteCharAt(sb.length()-1);
                }

            }
            else
            {
                sb.append(ch);
            }

        }

        return sb.toString();
    }
}
