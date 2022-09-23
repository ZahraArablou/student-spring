package com.keep.calm.java.controller;

import com.keep.calm.java.model.Student;
import com.keep.calm.java.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StudentControllerTest {

    @Mock
    private StudentService studentService;

    @InjectMocks
    private StudentController classUnderTest;

    @Test
    public void getAllStudents() {
               when(studentService.getAllStudent()).thenReturn(createStudentList());
               List<Student> result = classUnderTest.getAllStudents();

               assertEquals(3,result.size());
    }
private List<Student> createStudentList() {
            List<Student> students = new ArrayList<>();
            students.add(new Student(1,"Shapour", "Mahaei"));
            students.add(new Student(2,"Zahra", "Arablou"));
            students.add(new Student(3,"Simin", "Bigdeli"));
return students;

    }
    }
