package com.codecool.springBoot.dao;

import com.codecool.springBoot.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeStudentDao")
public class FakeStudentDao implements StudentDao {
    private static final Map<Integer, Student> students;

    static {
        students = new HashMap<>() {
            {
                put(1, new Student(1, "Matthew", "Computer Science"));
                put(2, new Student(2, "John", "Finance"));
                put(3, new Student(3, "Bob", "Maths"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        students.remove(id);
    }

    @Override
    public void updateStudent(Student newStudent, int id) {
        newStudent.setId(id);
        students.put(id, newStudent);
    }

    @Override
    public void insertStudent(Student student) {
        student.setId(students.size() + 1);
        students.put(students.size() + 1, student);
    }
}
