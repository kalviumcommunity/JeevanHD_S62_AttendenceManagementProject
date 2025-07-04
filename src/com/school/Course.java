package com.school;

public class Course {
    private int courseCounter = 101;

    int courseId;
    String courseName;

    public Course(String courseName) {
        this.courseId = courseCounter++;
        this.courseName = courseName;
    }

    public void setDetails(int id, String name) {
        this.courseId = id;
        this.courseName = name;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
    }
    
}
