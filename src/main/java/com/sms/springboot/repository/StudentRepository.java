package com.sms.springboot.repository;

import com.sms.springboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
