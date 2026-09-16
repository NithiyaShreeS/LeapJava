package com.example.Demo.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.Demo.Model.Student;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    List<Student> students = new ArrayList<>();

    public ResponseEntity<Student> addStudent(Student student) {

        System.out.println("Inside Student Repository...");

        students.add(student);

        return ResponseEntity.ok(student);
    }

    public ResponseEntity<List<Student>> getStudents() {

        System.out.println("Inside Student Repository - Get Students...");

        return ResponseEntity.ok(students);
    }
}