package org.example.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordLength {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple", "banana", "cherry", "date");
        printWordsWithLength(words);

    }

    private static void printWordsWithLength(List<String> words) {
        List<String> list=words.stream().
                map(name->name+name.length()).collect(Collectors.toList());
           // list.forEach(System.out::println);
       System.out.println(list);
    }
}
