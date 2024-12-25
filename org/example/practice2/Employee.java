package org.example.practice2;



public class Employee {
       String name;
       String department;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }


}
