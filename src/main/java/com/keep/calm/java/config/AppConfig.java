package com.keep.calm.java.config;

import com.keep.calm.java.controller.StudentController;
import com.keep.calm.java.repository.StudentRepository;
import com.keep.calm.java.repository.StudentRepositoryImpl;
import com.keep.calm.java.service.StudentService;
import com.keep.calm.java.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("studentRepository")
    public StudentRepository getStudentRepository(){
        StudentRepository studentRepository = new StudentRepositoryImpl();
        return studentRepository;
    }
    @Bean("studentService")
    public StudentService getStudentService(){
        StudentService studentService = new StudentServiceImpl();
        return studentService;
    }
    @Bean("studentController")
    public StudentController getStudentController(){
        StudentController studentController = new StudentController();
        return studentController;
    }

}
