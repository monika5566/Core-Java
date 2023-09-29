package com.tnsif.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private int age;

    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(100, "monika", 19));
        students.add(new Student(101, "bhoomika", 20));
        students.add(new Student(102, "ravi", 21));
        students.add(new Student(103, "sonu", 20));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a student ID to retrieve student details:");

        if (scanner.hasNextInt()) {
            try {
                int studentId = scanner.nextInt();

                
                boolean studentFound = false;
                for (Student student : students) {
                    if (student.getStudentId() == studentId) {
                        System.out.println("Student ID: " + student.getStudentId());
                        System.out.println("Name: " + student.getName());
                        System.out.println("Age: " + student.getAge());
                        studentFound = true;
                        break;
                    }
                }

                if (!studentFound) {
                    System.out.println("Student with ID " + studentId + " not found.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid input. Student ID should be greater than 100.");
        }

        scanner.close();
    }
}
