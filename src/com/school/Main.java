package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("---school Attendance System---");

        Student student1 = new Student("Kumar");
        Student student2 = new Student("abhi");

        Course course1 =  new Course("Pcmc");
        Course course2 = new Course("PcmB");

        System.out.println("Student Details:");
        student1.displayDetails();
        student2.displayDetails();
    
        System.out.println("Course Details");
        course1.displayDetails();
        course2.displayDetails();

        
    }
}