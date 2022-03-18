package com.jayesh.rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jayesh.rest.model.Employee;

@Repository
public class EmployeeDAO 
{
    private static List<Employee> list = new ArrayList<Employee> ();
    
    static 
    {
    	Employee employee = new Employee();
    	employee.setId(1L);
    	employee.setName("David");
    	employee.setDesignation("Engineer");
        list.add(employee);
    }
    
    public List<Employee> getAllEmployees() 
    {
        return list;
    }
    
    public boolean addEmployee(Employee employee) {
        return list.add(employee);
    }
}
