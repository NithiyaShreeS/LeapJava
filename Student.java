package com.example.Demo.Model;

public class Student {

    private int rollno;
    private String name;
    private int age;
    private String phone;
    private String dept;
    private String email;

    public Student() {
    }

    public Student(int rollno, String name, int age, String phone, String dept, String email) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.dept = dept;
        this.email = email;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}