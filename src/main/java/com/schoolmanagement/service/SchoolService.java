package com.schoolmanagement.service;

import com.schoolmanagement.model.Student;
import com.schoolmanagement.model.Teacher;
import java.util.List;

public interface SchoolService {
    void addStudent(Student student);
    void addTeacher(Teacher teacher);
    List<Student> getAllStudents();
    List<Teacher> getAllTeachers();
    Student findStudentById(int id);
    Teacher findTeacherById(int id);
}
