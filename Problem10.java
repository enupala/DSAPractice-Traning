package org.example.practice2;

public class Problem10 {
    public static void main(String[] args) {
        /*"Implement your custom atoi function in Java.
    Given a string, you have to convert into integer. The input string may contain alphabets and special characters alongside numbers (both negative and positive).

Examples:
    String str1 = ""123"";     //Return 123 (in integer format)

    String str2 = ""-123"";    //Return -123

    String str3 = ""1a23"";   //Return -1 (Invalid entry)"
*/
        String s="12a3";
      int num=  convertIntToString(s);
        System.out.println(num);
    }

    private static int convertIntToString(String s) {
        int val = 0;
        boolean isNegative=false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='-' && i==0)
            {
                isNegative=true;
                continue;
            }
            if(!Character.isDigit(ch))
                return -1;
            else{
                val=val*10+ch-'0';
            }
        }
        if(isNegative)
        return val*-1;
        else
            return val;
    }
}
