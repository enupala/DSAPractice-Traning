package streams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "tom", 20000),
                new Employee(2, "jack", 30000),
                new Employee(3, "kim", 10000));
    Optional<Double>thirdHighestSal=employeeList.stream().map(Employee::getSal).distinct()
            .sorted(Comparator.reverseOrder()).skip(2).findFirst();
    if(thirdHighestSal.isPresent())
        System.out.println(thirdHighestSal);
    }
}
