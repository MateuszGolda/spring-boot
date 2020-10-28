package com.codecool.springBoot.service;

import com.codecool.springBoot.dao.StudentDao;
import com.codecool.springBoot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Autowired
    @Qualifier("fakeStudentDao")
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        studentDao.removeStudentById(id);
    }

    public void updateStudent(Student newStudent, int id) {
        studentDao.updateStudent(newStudent, id);
    }

    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }
}
