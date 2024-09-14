package com;

import java.util.Date;

public class Employee implements Cloneable {
    private String name;
    private Date dob;
    private String mobileNumber;
    private int id;

    // Constructor
    public Employee(String name, Date dob, String mobileNumber, int id) {
        this.name = name;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getId() {
        return id;
    }

    // Overriding the clone() method to make a deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.dob = (Date) dob.clone(); // Assuming Date is mutable
        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", id=" + id +
                '}';
    }
}
