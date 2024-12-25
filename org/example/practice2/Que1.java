package org.example.practice2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Que1 {
    public static void main(String[] args) {

        List<Employee> employees = List.of(new Employee("Alice", "HR"),
                new Employee("Bob", "Engineering"),
                new Employee("Charlie", "HR"), new Employee("David", "Engineering"));
        Map<String, List<Employee>> emp = employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment));
      emp.forEach((dep,empl)-> System.out.println(dep +" : "+empl));
// hr [a,c]

    }
}
