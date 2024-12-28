package org.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>>grp=groupAnagrams(strs);
        System.out.println(grp);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String str:strs)
        {
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
            String sortedKey=new String(arr);
            map.putIfAbsent(sortedKey,new ArrayList<>());
            map.get(sortedKey).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
