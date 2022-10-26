package com.example.springbootstudentproject.controller;

import com.example.springbootstudentproject.entity.Student;
import com.example.springbootstudentproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/add_student")
    public String add(@RequestBody Student student){
        return service.add(student);
    }

    @GetMapping("get_student")
    public List<Student>getAll(){
        return service.getAll();
    }

    @PutMapping("update_student/{name}/{id}")
    public String update(@PathVariable String name,@PathVariable Integer id){

        return service.update("Mohan Singh",2);
    }

    @DeleteMapping("delete_student")
    public String delete(@RequestParam Integer id){

        return service.delete(3);
    }
}
