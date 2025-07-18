package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---school Attendance System---");

        Student student1 = new Student("Kumar");
        Student student2 = new Student("abhi");

        Course course1 = new Course("Pcmc");
        Course course2 = new Course("PcmB");

        System.out.println("Student Details:");
        student1.displayDetails();
        student2.displayDetails();

        System.out.println("Course Details");
        course1.displayDetails();
        course2.displayDetails();

        List<Attendance> attendanceLog = new ArrayList<>();

        Attendance attendance1 = new Attendance(student1.getStudentId(), course1.getCourseId(), "Present");
        Attendance attendance2 = new Attendance(student2.getStudentId(), course2.getCourseId(), "Absent");

        attendanceLog.add(attendance1);
        attendanceLog.add(attendance2);

        for (Attendance record : attendanceLog) {
            record.display();
        }

    }
}