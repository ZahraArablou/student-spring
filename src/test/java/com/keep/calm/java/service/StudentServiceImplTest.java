package com.keep.calm.java.service;

import com.keep.calm.java.controller.StudentController;
import com.keep.calm.java.model.Student;
import com.keep.calm.java.repository.StudentRepository;
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
public class StudentServiceImplTest {
    @Mock
    private StudentRepository studentRepositry;

    @InjectMocks
    private StudentService classUnderTestService;

    @Test
    public void testGetAllStudent() {
        when(studentRepositry.findAll()).thenReturn(createStudentList());
        List<Student> result = classUnderTestService.getAllStudent();

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