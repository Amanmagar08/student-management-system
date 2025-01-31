package com.sms.springboot;

import com.sms.springboot.entity.Student;
import com.sms.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFirstAppApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstAppApplication.class, args);

	}

		@Autowired
		private StudentRepository studentRepository;

		@Override
				public void run(String... args) throws Exception {

//			Student student1 = new Student("John", "Doe", "john@gmail.com");
//			studentRepository.save(student1);
//
//			Student student2 = new Student("Sanjay", "Puri", "puri@gmail.com");
//			studentRepository.save(student2);
//
//			Student student3 = new Student("Tony", "Stark", "tony@gmail.com");
//			studentRepository.save(student3);
		}
}
