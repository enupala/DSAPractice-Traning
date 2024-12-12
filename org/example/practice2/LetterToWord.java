package org.example.practice2;

import java.util.*;

public class LetterToWord {
   public static final HashMap<Character,String> map=new HashMap<>();
    public static void main(String[] args) {

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        map.put('1',"1");
        map.put('0',"0");
        String digits="23";
        stringCombinations(digits);

    }
    public static void stringCombinations(String digits) {
        // Edge case: if the input is empty, return an empty list
        if (digits == null || digits.isEmpty()) {
            System.out.println(Collections.emptyList());
            return;
        }

        ArrayList<String> list = new ArrayList<>();
        Queue<String> q = new ArrayDeque<>();

        // Start with an empty string in the queue
        q.offer("");

        for (int i = 0; i < digits.length(); i++) {
            char ch = digits.charAt(i); // Current digit (like '2', '3', etc.)
            String letters = map.get(ch); // Corresponding letters for the current digit
            int size = q.size(); // Number of elements currently in the queue

            for (int j = 0; j < size; j++) {
                String currentCombination = q.poll(); // Get the current combination from the queue

                // Append each letter corresponding to the current digit
                for (char l : letters.toCharArray()) {
                    q.offer(currentCombination + l); // Add the new combination to the queue
                }
            }
        }

        list.addAll(q); // Add all final combinations to the list
        System.out.println(list);
    }

   /* private static void stringCombinations(String digits) {
        ArrayList<String>list=new ArrayList<>();
        Queue<String>q=new ArrayDeque<>();
        q.offer(" ");
        for(int i=0;i<digits.length();i++) {
             char ch =digits.charAt(i);


             while(!q.isEmpty()){
//                 String c=q.poll();
                 String letters=map.get(ch);
                 String c=q.poll();
                 for(char l:letters.toCharArray())
                 {
                     q.offer(l+c);
                 }


             }
        }
        list.addAll(q);
        System.out.println(list);


    }*/
}
