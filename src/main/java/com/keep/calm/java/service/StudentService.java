package com.keep.calm.java.service;

import com.keep.calm.java.model.Student;
import com.keep.calm.java.repository.StudentRepositoryImpl;

import java.util.List;

public interface StudentService {
  List<Student> getAllStudent();
}
