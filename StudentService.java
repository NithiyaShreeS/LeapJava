package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Model.Student;
import com.example.Demo.Repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public ResponseEntity<Student> addStudent(Student student) {

        System.out.println("Inside Student Service...");

        return studentRepository.addStudent(student);
    }

    public ResponseEntity<List<Student>> getStudents() {

        System.out.println("Inside Student Service - Get Students...");

        return studentRepository.getStudents();
    }
}