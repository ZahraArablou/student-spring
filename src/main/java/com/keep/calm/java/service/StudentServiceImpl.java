package com.keep.calm.java.service;

import com.keep.calm.java.model.Student;
import com.keep.calm.java.repository.StudentRepository;
import com.keep.calm.java.repository.StudentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {
@Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentServiceImpl() {
    }

    @Override
    public List<Student> getAllStudent(){

        List<Student> students = studentRepository.findAll();
        return students;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
