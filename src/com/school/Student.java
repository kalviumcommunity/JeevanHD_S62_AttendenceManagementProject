package com.school;

public class Student {
    int studentId;
    String name;

    public void setDetails(int id, String studentName) {
        this.studentId = id;
        this.name = studentName;
    }
    
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
    }

    
}
