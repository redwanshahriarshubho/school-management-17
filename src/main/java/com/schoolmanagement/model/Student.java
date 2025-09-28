package com.schoolmanagement.model;

public class Student {
    private int id;
    private String name;
    private int grade;
    
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    
    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getGrade() { return grade; }
    
    public void setName(String name) { this.name = name; }
    public void setGrade(int grade) { this.grade = grade; }
    
    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Grade=" + grade + "]";
    }
}
