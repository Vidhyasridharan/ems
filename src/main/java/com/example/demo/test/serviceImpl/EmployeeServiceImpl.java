package com.example.demo.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.test.entity.EmployeeEntity;
import com.example.demo.test.repository.EmployeeRepository;
@Transactional
@Service
public class EmployeeServiceImpl implements com.example.demo.test.service.EmployeeService{

	private EmployeeRepository employeerepository;
	public EmployeeServiceImpl(EmployeeRepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}
	@Override
	public List<EmployeeEntity> listallEmployees() {
		
		return employeerepository.findAll();
	}
	@Override
	public EmployeeEntity addEmployee(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		return employeerepository.save(employee);
	}
	@Override
	public EmployeeEntity editEmployee(Long id) {
		// TODO Auto-generated method stub
		return employeerepository.findById(id).get();
	}
	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		
		return employeerepository.save(employee);
	}
	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		 employeerepository.deleteById(id);
		
	}

}
