package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList implements Iterable<Employee> {
    private List<Employee> employees;

    // Constructor
    public EmployeeList() {
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Implementing the iterator() method
    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator(employees);
    }
}

