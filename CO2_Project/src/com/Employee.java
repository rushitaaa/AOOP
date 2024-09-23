package com;

import java.util.Objects;

public class Employee implements Comparable<Employee>, Cloneable {
    private int id;
    private String name;
    private int hoursWorked;

    public Employee(int id, String name, int hoursWorked) {
        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); 
        }
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Hours Worked: " + hoursWorked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && hoursWorked == employee.hoursWorked && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hoursWorked);
    }
}