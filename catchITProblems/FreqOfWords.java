package catchITProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class FreqOfWords {
    // String[][] array = {
    //            {"apple", "banana", "orange"},
    //            {"apple", "orange", "banana", "apple"},
    //            {"banana", "apple", "apple"}
    //        };
    public static void main(String[] args) {
        List<List<String>>wordList=Arrays.asList(
                Arrays.asList("apple","banana","orange"),
                Arrays.asList("apple","orange","banana","apple"),
                Arrays.asList("banana","apple","apple")
        );

        Map<String,Long>map=wordList.stream().flatMap(List::stream)
                .collect(Collectors.groupingBy(str->str,Collectors.counting()));
        System.out.println(map);
    }


}
