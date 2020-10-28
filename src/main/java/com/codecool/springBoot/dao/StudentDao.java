package com.codecool.springBoot.dao;

import com.codecool.springBoot.entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student newStudent, int id);

    void insertStudent(Student student);
}
