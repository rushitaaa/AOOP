package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create an EmployeeList instance
        EmployeeList employeeList = new EmployeeList();

        // Define a date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Add employees to the list
            employeeList.addEmployee(new Employee("Alice", dateFormat.parse("1990-05-12"), "1234567890", 101));
            employeeList.addEmployee(new Employee("Bob", dateFormat.parse("1985-10-22"), "0987654321", 102));
            employeeList.addEmployee(new Employee("Charlie", dateFormat.parse("1992-03-15"), "1122334455", 103));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Iterate over the list of employees and display their details
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        // Demonstrating the cloneable feature
        try {
            Employee original = new Employee("David", dateFormat.parse("1988-08-20"), "6677889900", 104);
            Employee cloned = (Employee) original.clone();

            // Display original and cloned employee details
            System.out.println("\nOriginal Employee: " + original);
            System.out.println("Cloned Employee: " + cloned);

        } catch (CloneNotSupportedException | ParseException e) {
            e.printStackTrace();
        }
    }
}
