package com.schoolmanagement.model;

public class Teacher {
    private int id;
    private String name;
    private String subject;
    
    public Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }
    
    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSubject() { return subject; }
    
    @Override
    public String toString() {
        return "Teacher [ID=" + id + ", Name=" + name + ", Subject=" + subject + "]";
    }
}
