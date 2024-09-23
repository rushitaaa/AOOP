package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Timesheet implements Iterable<Employee> {
    private List<Employee> employees;

    public Timesheet() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void removeEmployee(Employee e) {
        employees.remove(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }

    public void printAllEmployees() {
        for (Employee e : this) {
            System.out.println(e);
        }
    }
}