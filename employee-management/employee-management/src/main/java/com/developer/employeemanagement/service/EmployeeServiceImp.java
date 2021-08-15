package com.developer.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import com.developer.employeemanagement.Repository.EmployeeRepository;
import com.developer.employeemanagement.entity.EmployeeEntity;

public class EmployeeServiceImp implements EmployeeService{

	private final EmployeeRepository employeeRepository;
	
	public EmployeeServiceImp(EmployeeRepository employeerepository) {
	      this.employeeRepository=employeerepository;
	}
	@Override
	public List<EmployeeEntity> findAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Optional<EmployeeEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employeeEntity);
	}

	@Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

}
