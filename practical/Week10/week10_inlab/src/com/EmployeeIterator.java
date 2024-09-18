package com;

import java.util.Iterator;
import java.util.List;

public class EmployeeIterator implements Iterator<Employee> {
    private List<Employee> employees;
    private int position;

    // Constructor
    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < employees.size();
    }

    @Override
    public Employee next() {
        return employees.get(position++);
    }
}

