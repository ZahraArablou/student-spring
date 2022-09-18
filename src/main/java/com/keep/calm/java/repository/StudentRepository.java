package com.keep.calm.java.repository;

import com.keep.calm.java.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}
