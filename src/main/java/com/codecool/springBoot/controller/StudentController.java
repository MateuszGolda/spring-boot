package com.codecool.springBoot.controller;

import com.codecool.springBoot.entity.Student;
import com.codecool.springBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable int id) {
        studentService.removeStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Student newStudent, @PathVariable int id) {
        studentService.updateStudent(newStudent, id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void insertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
    }
}
