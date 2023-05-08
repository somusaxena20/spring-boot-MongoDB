package com.somu.springbootmongodb.controller;

import com.somu.springbootmongodb.model.Student;
import com.somu.springbootmongodb.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping ("/add")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        Student save = this.studentRepo.save(student);

        return new ResponseEntity<>(save, HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getStudent()
    {
        List<Student> all = this.studentRepo.findAll();

        return new ResponseEntity<>(all, HttpStatus.OK);
    }
}
