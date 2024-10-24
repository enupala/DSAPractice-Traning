package org.example.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem7 {
    public static void main(String[] args) {
        /*
        * "Prefix Search
    Given a document and a prefix, return all the words starting with the prefix.

Example:
Say the document is a string of words,
    String[] arr = {""apple"", ""applet"", ""bread"", ""aper""};
    String prefix = ""app"";

    // Return apple, applet"
*/
        String[] arr = {"apple", "applet", "bread", "Aper","apexon"};
        String prefix = "ape";
        prefixSearch(arr,prefix);

    }
    private  static void prefixSearch(String []arr,String prefix)
    {
        List<String> words=Arrays.asList(arr).stream().filter(name->name.toLowerCase().startsWith(prefix)).collect(Collectors.toList());
       for(String s:words)
        System.out.print(s+" ");
    }


}
