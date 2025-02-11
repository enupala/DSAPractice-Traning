package catchITProblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        String s="swiss";
        char ch=finFirstNonRepatingCharUsingStreams(s);
        //char ch=findingNonRepeatingChar(s);
        System.out.println(ch);
    }
    private static Character finFirstNonRepatingCharUsingStreams(String s)
    {
        Character ch=s.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst()
                .orElse(null);
        return ch;
    }
    private static Character finFirstNonRepatingCharUsingStreams1(String s){
        Character ch=s.chars().mapToObj(c->(char)c).collect(
                Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting())).entrySet().stream()
                .filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);


        return ch;
    }
    private static char findFirstNonRepeatingChar(String s) {
        HashMap<Character,Integer>map=new HashMap();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
           /* if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }*/
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char ch='0';
        for(char c:s.toCharArray())
        {
            if(map.get(c)==1) {
                ch = c;
                break;
            }

        }
        return ch;
    }
    private static Character findingNonRepeatingChar(String s)
    {

        int[] charCount = new int[256];
        for (char ch : s.toCharArray()) {
            charCount[ch]++;
        }

        // Find the first non-repeating character
        for (char ch : s.toCharArray()) {
            if (charCount[ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }
}
