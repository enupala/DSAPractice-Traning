package org.example.practice2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        //Convert a List to a Stream and Print All Elements
        names.stream().forEach(System.out::println);
        //Filter Even Numbers from a List
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        nums.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
        //Find the First Element Matching a Condition
        Optional<Integer> firstEven = nums.stream().filter(n -> n % 2 == 0).findFirst();
        System.out.println(firstEven);
        //Map a List of Strings to Their Uppercase Versions
        List<String> uppercased = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercased);
        //Find the Sum of All Elements in a List
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        //avg
        OptionalDouble avg = nums.stream().mapToInt(Integer::intValue).average();
        System.out.println(avg);
        //max
        OptionalInt max = nums.stream().mapToInt(Integer::intValue).max();
        System.out.println(max);
        //min
        OptionalInt min = nums.stream().mapToInt(Integer::intValue).min();
        System.out.println(min);
        //Sort a List of Strings
        List<Integer> numbers = List.of(1, 2, 30, 14, 5);
        List<Integer> sortedNums = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNums);
        //Group Employees by Department
        List<Employee> employees = List.of(new Employee("Alice", "HR"),
                new Employee("Bob", "Engineering"),
                new Employee("Charlie", "HR"), new Employee("David", "Engineering"));
        Map<String, List<Employee>> groupedBydept = employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment));
        groupedBydept.forEach((dept, name) -> System.out.println(dept + " " + name));
        //Partition a List of Integers into Even and Odd
        Map<Boolean, List<Integer>> partiionedNums = numbers.stream().
                collect(Collectors.partitioningBy(n -> n % 2 == 0));
        partiionedNums.forEach((key, value) -> System.out.println(key + " " + value));
        //freq of words
        List<String> words = List.of("apple", "banana", "apple", "cherry", "banana", "banana");
        Map<String, Long> freqOfWords = words.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqOfWords);
        //Flatten a List of Lists
        List<List<Integer>> listOfLists = List.of(List.of(1, 2), List.of(3, 4));
        List<Integer> flattenList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flattenList);
        //Find the Second-Highest Number
        Optional<Integer> second = numbers.stream().sorted(Comparator.reverseOrder())
                .distinct().skip(1).findFirst();
        System.out.println(second);
//Generate a Stream of Random Numbers
        Stream<Integer>randomNums=Stream.generate(()->new Random().nextInt(100)).limit(10);
        randomNums.forEach(System.out::println);
        //Check if All Elements Match a Condition
        boolean allEven=numbers.stream().allMatch(n->n%2==0);
        System.out.println(allEven);

        //Find Top N Elements
        List<Integer>top3=numbers.stream().sorted(Comparator.reverseOrder()).
                limit(3).collect(Collectors.toList());
        System.out.println(top3);
        List<String> inputList = Arrays.asList("hello", "world", "java", "stream", "api");
        List<String>output=inputList.stream().map(str->
        {
            if(str.length()>=2)
            {
                return str.substring(0,1).toLowerCase()+
                        str.substring(1,2).toUpperCase()+
                        str.substring(2).toLowerCase();
            }
            else{
              return  str.toLowerCase();
            }
        }).collect(Collectors.toList());
        output.forEach(System.out::println);

        List<Integer>squaredNums=nums.stream().map(n->n*n).collect(Collectors.toList());
        squaredNums.forEach(System.out::println);



    }
}
