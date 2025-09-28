package com.schoolmanagement.service.impl;

import com.schoolmanagement.model.Student;
import com.schoolmanagement.model.Teacher;
import com.schoolmanagement.service.SchoolService;
import java.util.ArrayList;
import java.util.List;

public class SchoolServiceImpl implements SchoolService {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    
    @Override
    public void addStudent(Student student) {
        students.add(student);
    }
    
    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    
    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
    
    @Override
    public List<Teacher> getAllTeachers() {
        return new ArrayList<>(teachers);
    }
    
    @Override
    public Student findStudentById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    @Override
    public Teacher findTeacherById(int id) {
        return teachers.stream()
                .filter(teacher -> teacher.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
