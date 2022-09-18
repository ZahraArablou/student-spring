package com.keep.calm.java.repository;

import com.keep.calm.java.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public List<Student> findAll(){
        Student student1 = new Student(100,"Zahra", "Arablou");
        Student student2 = new Student(200,"Simin","Bigdeli");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        return studentList;
    }
}
