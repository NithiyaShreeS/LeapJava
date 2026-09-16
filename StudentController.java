package com.example.Demo.Controller;

import java.util.List;

import com.example.Demo.Model.Student;
import com.example.Demo.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {

        System.out.println("Inside Student Controller...");

        return studentService.addStudent(student);
    }

    @GetMapping("/getStudents")
    public ResponseEntity<List<Student>> getStudents() {

        System.out.println("Inside Student Controller - Get Students...");

        return studentService.getStudents();
    }
}