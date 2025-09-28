package com.schoolmanagement;

import com.schoolmanagement.model.Student;
import com.schoolmanagement.model.Teacher;
import com.schoolmanagement.service.SchoolService;
import com.schoolmanagement.service.impl.SchoolServiceImpl;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static SchoolService schoolService = new SchoolServiceImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== SCHOOL MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. View All Students");
            System.out.println("4. View All Teachers");
            System.out.println("5. Find Student by ID");
            System.out.println("6. Find Teacher by ID");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    viewAllStudents();
                    break;
                case 4:
                    viewAllTeachers();
                    break;
                case 5:
                    findStudent();
                    break;
                case 6:
                    findTeacher();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        
        scanner.close();
        System.out.println("System exited. Goodbye!");
    }
    
    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Grade: ");
        int grade = scanner.nextInt();
        
        schoolService.addStudent(new Student(id, name, grade));
        System.out.println("Student added successfully!");
    }
    
    private static void addTeacher() {
        System.out.print("Enter Teacher ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Teacher Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        
        schoolService.addTeacher(new Teacher(id, name, subject));
        System.out.println("Teacher added successfully!");
    }
    
    private static void viewAllStudents() {
        List<Student> students = schoolService.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            System.out.println("\n=== STUDENT LIST ===");
            students.forEach(System.out::println);
        }
    }
    
    private static void viewAllTeachers() {
        List<Teacher> teachers = schoolService.getAllTeachers();
        if (teachers.isEmpty()) {
            System.out.println("No teachers found!");
        } else {
            System.out.println("\n=== TEACHER LIST ===");
            teachers.forEach(System.out::println);
        }
    }
    
    private static void findStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();
        Student student = schoolService.findStudentById(id);
        System.out.println(student != null ? student : "Student not found!");
    }
    
    private static void findTeacher() {
        System.out.print("Enter Teacher ID to search: ");
        int id = scanner.nextInt();
        Teacher teacher = schoolService.findTeacherById(id);
        System.out.println(teacher != null ? teacher : "Teacher not found!");
    }
}
