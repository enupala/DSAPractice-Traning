package org.example.practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestAvgMarks {
    public static void main(String[] args) {
        String[][] students= {
                {"Charles", "84"},
            {"John", "100"},
            {"Andy", "37"},
            {"John", "23"},
            {"Charles", "20"}
        };
       double marks= calculateAvgMarks(students);
        System.out.println(marks);
        //Return 61.5 (which is of John's)"
    }
    private static double calculateAvgMarks(String[][] students) {
        HashMap<String, List<Integer>> stuMarks = new HashMap<>();
        double high = Double.NEGATIVE_INFINITY;
        double avg = 0;
        String topStu="";
        for (String[] entry : students) {
            String name = entry[0];
            int marks = Integer.parseInt(entry[1]);
            stuMarks.putIfAbsent(name, new ArrayList<>());
            stuMarks.get(name).add(marks);
        }
        for (String name : stuMarks.keySet())
        {
            int sum=0;
            List<Integer> marksList=stuMarks.get(name);
            for(int marks:marksList)
            {
                sum+=marks;
            }
            avg=(double)sum/marksList.size();
            if(avg>high)
            {
                high=avg;
                topStu=name;
            }
        }
        System.out.println(topStu);
        return high;
    }

    private static double calculateAvgMarks1(String[][] students) {
        double highestMarks=Double.NEGATIVE_INFINITY;
        String topStudent="";
        double avg=0;
        Map<String, List<Integer>>stuNameMarks=new HashMap<>();
        for(String[] entry: students)
        {
            String name=entry[0];
            int marks=Integer.parseInt(entry[1]);
            stuNameMarks.putIfAbsent(name,new ArrayList<>());
            stuNameMarks.get(name).add(marks);
        }


        for(String name:stuNameMarks.keySet())
        {
            int sum=0;
            List<Integer>marksList=stuNameMarks.get(name);

            for(int marks:marksList)
            {
                sum+=marks;
            }
             avg=(double)sum/marksList.size();
            if(avg>highestMarks)
            {
                highestMarks=avg;
                topStudent=name;

            }

        }

        System.out.print(topStudent+" ");
        return highestMarks;
    }
}
