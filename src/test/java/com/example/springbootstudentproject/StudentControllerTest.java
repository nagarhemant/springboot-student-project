package com.example.springbootstudentproject;

import com.example.springbootstudentproject.controller.StudentController;
import com.example.springbootstudentproject.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StudentControllerTest {

    @Autowired
    StudentController studentController;

    @Test
    public void saveStudentTest(){

        Student student=new Student();
        assertFalse(studentController.getAll().isEmpty());
    }

    @Test
   public void getStudentTest(){
       List<Student>students=studentController.getAll();
       ;
   }
}
