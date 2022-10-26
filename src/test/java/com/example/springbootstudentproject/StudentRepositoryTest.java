package com.example.springbootstudentproject;

import com.example.springbootstudentproject.entity.Student;
import com.example.springbootstudentproject.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StudentRepositoryTest {

 @Autowired
 private StudentRepository repository;

@Test
public void testSaveStudent(){

 Student student=Student.builder()
         .name("Mohit Kumar")
         .section("Science")
         .age(18)
         .build();

 repository.save(student);

 assertThat(student.getId()).isGreaterThan(0);

}

@Test
public void testGetStudent(){

 Student student=repository.findById(1).get();

 assertThat(student.getId()).isEqualTo(1);

}

 @Test
 public void testGetListOfStudent(){

  List<Student>students=repository.findAll();

  assertThat(students.size()).isGreaterThan(0);

 }

 @Test
 public void testUpdateStudent(){

  Student student=repository.findById(1).get();

  student.setSection("Arts");

  Student studentUpdated = repository.save(student);

  assertThat(studentUpdated.getSection()).isEqualTo("Arts");

 }

 @Test
 public void testDeleteStudent(){

Student student=repository.findById(1).get();

repository.deleteById(1);

assertThat(student.getId()).isNull();
 }


}
