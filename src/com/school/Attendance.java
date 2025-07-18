package com.school;

public class Attendance {
    private int studentId, courseId;
    String status;

    public Attendance(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;

        if ("Present".equalsIgnoreCase(status) || "Absent".equalsIgnoreCase(status)) {
            this.status = status;
        } else {
            this.status = "invalid";
            System.out.println("Invalid status. Please use 'Present' or 'Absent'.");
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getStatus() {
        return status;
    }

    public void display() {
        System.out.printf("Attendance: Student ID: %d in Course ID: %d is %s%n", studentId, courseId, status);
    }
}
