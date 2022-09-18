package com.keep.calm.java.controller;

import com.keep.calm.java.model.Student;
import com.keep.calm.java.service.StudentService;
import com.keep.calm.java.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentController {
    @Autowired
    private StudentService studentService;

      public List<Student> getAllStudents() {
//        studentService= new StudentServiceImpl();
        return studentService.getAllStudent();

    }

    }
