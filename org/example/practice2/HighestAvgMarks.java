package org.example.practice2;

import java.util.*;
import java.util.stream.Collectors;

public class HighestAvgMarks {
    public static void main(String[] args) {
        String[][] students = {
                {"Charles", "84"},
                //52
                //61.5

                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };
        double marks = calculateAvgMarksUsingStream(students);
        System.out.println(marks);
        //Return 61.5 (which is of John's)"
    }

    private static double calculateAvgMarks(String[][] students) {
        HashMap<String, List<Integer>> stuMarks = new HashMap<>();
        double high = Double.NEGATIVE_INFINITY;
        double avg = 0;
        String topStu = "";
        for (String[] entry : students) {
            String name = entry[0];
            int marks = Integer.parseInt(entry[1]);
            stuMarks.putIfAbsent(name, new ArrayList<>());
            stuMarks.get(name).add(marks);
        }
        for (String name : stuMarks.keySet()) {
            int sum = 0;
            List<Integer> marksList = stuMarks.get(name);
            for (int marks : marksList) {
                sum += marks;
            }
            avg = (double) sum / marksList.size();
            if (avg > high) {
                high = avg;
                topStu = name;
            }
        }
        System.out.println(topStu);
        return high;
    }

    private static double calculateAvgMarks1(String[][] students) {
        double highestMarks = Double.NEGATIVE_INFINITY;
        String topStudent = "";
        double avg = 0;
        Map<String, List<Integer>> stuNameMarks = new HashMap<>();
        for (String[] entry : students) {
            String name = entry[0];
            int marks = Integer.parseInt(entry[1]);
            stuNameMarks.putIfAbsent(name, new ArrayList<>());
            stuNameMarks.get(name).add(marks);
        }


        for (String name : stuNameMarks.keySet()) {
            int sum = 0;
            List<Integer> marksList = stuNameMarks.get(name);

            for (int marks : marksList) {
                sum += marks;
            }
            avg = (double) sum / marksList.size();
            if (avg > highestMarks) {
                highestMarks = avg;
                topStudent = name;

            }

        }

        System.out.print(topStudent + " ");
        return highestMarks;
    }

    private static double calculateAvgMarks2(String[][] students) {
        double highest = Double.NEGATIVE_INFINITY;
        HashMap<String, List<Integer>> studMarks = new HashMap<>();
        for (String[] sname : students) {
            String name = sname[0];
            int marks = Integer.parseInt(sname[1]);
            studMarks.putIfAbsent(name, new ArrayList<>());
            studMarks.get(name).add(marks);
        }
        double avg = 0;
        for (String name : studMarks.keySet()) {
            int sum = 0;
            List<Integer> marks = studMarks.get(name);
            for (int mark : marks) {
                sum += mark;
            }
            avg = (double) sum / marks.size();
            if (highest < avg) {
                highest = avg;
            }

        }
        return highest;
    }

    private static double calculateAvgMarksUsingStream(String[][] students) {
        return Arrays.stream(students)
                .collect(Collectors.groupingBy(
                        entry -> entry[0], // Group by student name
                        Collectors.mapping(
                                entry -> Integer.parseInt(entry[1]), // Convert marks to integers
                                Collectors.toList() // Collect marks into a list
                        )
                ))
                .values() // Get the grouped student data
                .stream()
                .mapToDouble(marks -> marks.stream().mapToInt(Integer::intValue).average().orElse(0))
                // Calculate the average of marks
                .max() // Get the highest average
                .orElse(Double.NEGATIVE_INFINITY); // If no student, return NEGATIVE_INFINITY
    }
}
