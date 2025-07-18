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

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayDetails() {
        System.out.printf("Course ID: %d", courseId, "\n");
        System.out.printf("Course Name: %s", courseName, "\n");
    }

}
