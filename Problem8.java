package org.example.practice2;

import java.util.HashMap;
import java.util.Map;

public class Problem8 {
    public static void main(String[] args) {
        /*"Given a string,
    return the first non-repeating character.

Examples:
String str1 = ""12345""
    //Return 1

String str2 = ""abbacd""
    //Return c"
*/
        String str2 = "12345";
        findFirstNonRepeatingChar(str2);
    }

    private static void findFirstNonRepeatingChar(String str2) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=str2.length();
        for(int i=0;i<n;i++)
        {
            char ch=str2.charAt(i);
            if(map.containsKey((ch)))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
                map.put(ch,1);
        }


       for(int i=0;i<str2.length();i++)
       {
           char ch=str2.charAt(i);
           if(map.get(ch)==1) {
               System.out.println(ch);
               break;
           }
       }
    }
}
