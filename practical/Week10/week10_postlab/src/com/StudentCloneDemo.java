package com;

public class StudentCloneDemo {
    public static void main(String[] args) {
        try {
            // Create an original Student object
            Student originalStudent = new Student("Alice", 101, 85.5);

            // Clone the original Student object
            Student clonedStudent = (Student) originalStudent.clone();

            // Display the original and cloned Student objects
            System.out.println("Original Student: " + originalStudent);
            System.out.println("Cloned Student: " + clonedStudent);

            // Modify the cloned student's attributes
            // Note: The attributes of the original student remain unchanged
            clonedStudent = new Student("Bob", 102, 90.0);

            System.out.println("\nAfter modifying the cloned student:");
            System.out.println("Original Student: " + originalStudent);
            System.out.println("Cloned Student: " + clonedStudent);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

