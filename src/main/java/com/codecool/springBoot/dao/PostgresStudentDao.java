package com.codecool.springBoot.dao;

import com.codecool.springBoot.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("postgresStudentDao")
public class PostgresStudentDao implements StudentDao {
    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<>() {
            {
                add(new Student(1, "Natalia", "Florystyka"));
                add(new Student(2, "Mateusz", "Programowanie"));
                add(new Student(3, "Foo", "Bar"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student newStudent, int id) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
