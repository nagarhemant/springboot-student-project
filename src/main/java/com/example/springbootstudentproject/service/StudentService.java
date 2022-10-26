package com.example.springbootstudentproject.service;

import com.example.springbootstudentproject.entity.Student;
import com.example.springbootstudentproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public String add(Student student){
        repo.save(student);
        return "student added";
    }
    public List<Student>getAll(){

        return repo.findAll();
    }

    public String update(String name, Integer id){
        Student student=repo.findById(id).get();
        student.setName("Mohan Singh");
        return repo.save(student).getName();
    }

    public String delete(Integer id){
       repo.deleteById(id);
       return "deleted";
    }
}
