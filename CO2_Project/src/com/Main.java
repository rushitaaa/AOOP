package com;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(101, "Alice", 40);
        Employee emp2 = new Employee(102, "Bob", 38);
        Employee emp3 = new Employee(103, "Charlie", 42);

        Timesheet timesheet = new Timesheet();
        timesheet.addEmployee(emp1);
        timesheet.addEmployee(emp2);
        timesheet.addEmployee(emp3);

        System.out.println("Original List of Employees:");
        timesheet.printAllEmployees();

        Employee clonedEmployee = emp1.clone();
        System.out.println("\nCloned Employee:");
        System.out.println(clonedEmployee);

        Collections.sort(timesheet.getEmployees(), new NameComparator());

        System.out.println("\nEmployees Sorted by Name:");
        timesheet.printAllEmployees();
    }
}

