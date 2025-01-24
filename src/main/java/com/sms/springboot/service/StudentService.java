package com.sms.springboot.service;

import com.sms.springboot.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    public void deleteStudentById(Long id);

    Student deleteStudent(Student student);
}
