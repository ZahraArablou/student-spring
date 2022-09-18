package com.keep.calm.java;

import com.keep.calm.java.config.AppConfig;
import com.keep.calm.java.controller.StudentController;
import com.keep.calm.java.model.Student;
import com.keep.calm.java.repository.StudentRepository;
import com.keep.calm.java.repository.StudentRepositoryImpl;
import com.keep.calm.java.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class StudentApplication {
    public static void main(String[] args) {
//        StudentRepository studentRepository = new StudentRepositoryImpl();
//        StudentServiceImpl studentService = new StudentServiceImpl();
//        studentService.setStudentRepository(studentRepository);
//
//
//        StudentController studentControllers = new StudentController(studentService);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
StudentController studentController = applicationContext.getBean("studentController",StudentController.class);
        List<Student> students = studentController.getAllStudents();
        System.out.println(students);
    }
}
