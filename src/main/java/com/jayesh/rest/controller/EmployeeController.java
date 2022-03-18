package com.jayesh.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.jayesh.rest.dao.EmployeeDAO;
import com.jayesh.rest.api.EmployeesApi;
import com.jayesh.rest.model.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController implements EmployeesApi {

	@Autowired
	private EmployeeDAO employeeDao;
	   
    @Override
    public ResponseEntity<String> addEmployee(Employee employee) {
        if (employeeDao.addEmployee(employee)) {
        	return ResponseEntity.ok(employee.getName()+" is added");
        } 
        return new ResponseEntity<String> (employee.getName()+" is not added", HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<List<Employee>> getEmployee() {
    	return new ResponseEntity<List<Employee>>(employeeDao.getAllEmployees(), HttpStatus.OK);
    }
}
