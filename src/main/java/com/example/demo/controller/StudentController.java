package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;

@RestController
public class StudentController{
    @Autowired
    StudentService StudentService;
    @PostMapping("/postdata")
    public ResponsiveEntity<Student> postdata(@RequestBody Student student){
        return new ResponseEntity<>(studentService.saveStudent(student)),HttpStatus.CREATED);
    }
}
