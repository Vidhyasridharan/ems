package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.test.entity.EmployeeEntity;
import com.example.demo.test.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeemanagementsystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagementsystemApplication.class, args);
	}
 @Autowired
 private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * EmployeeEntity employee1 =new EmployeeEntity("Vijay", "G", "vgov@gmail.com");
		 * employeeRepository.save(employee1); EmployeeEntity employee2 =new
		 * EmployeeEntity("Vidhya", "S", "vsrid@gmail.com");
		 * employeeRepository.save(employee2); EmployeeEntity employee3 =new
		 * EmployeeEntity("Prasanna", "S", "psrid@gmail.com");
		 * employeeRepository.save(employee3);
		 */
	}

}
