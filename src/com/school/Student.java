package com.school;

public class Student {
    private int nextStudentCounter = 1;
    
    int studentId;
    String name;

    public Student(String name) {
        this.studentId = nextStudentCounter++;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
    }

    
}
