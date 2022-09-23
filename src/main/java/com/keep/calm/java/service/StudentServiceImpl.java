package com.keep.calm.java.service;

import com.keep.calm.java.model.Student;
import com.keep.calm.java.repository.StudentRepository;
import com.keep.calm.java.repository.StudentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
@Autowired
    private StudentRepository studentRepository;

      @Override
    public List<Student> getAllStudent(){

        List<Student> students = studentRepository.findAll();
        return students;
    }
}
