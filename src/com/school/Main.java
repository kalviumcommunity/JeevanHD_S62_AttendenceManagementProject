package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("---school Attendance System---");

        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].setDetails(1, "Kumar");
        students[1] = new Student();
        students[1].setDetails(2, "Ravi");

        Course[] courses = new Course[2];
        courses[0] = new Course();
        courses[0].setDetails(101, "Mathematics");
        courses[1] = new Course();
        courses[1].setDetails(102, "Science");

        System.out.println("Student Details:");
        for (Student student : students) {
            if (student != null)
                student.displayDetails();
        }
        
        System.out.println("\nCourse Details:");
        for (Course course : courses) {
            if (course != null)
                course.displayDetails();
        }

        
    }
}