package com.plastic.employee.service.impl;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.plastic.employee.model.Employee;
import com.plastic.employee.repository.EmployeeRepository;
import com.plastic.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> list() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee listId(int id) {
        return null;
    }

    @Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee edit(Employee employee) {
        return null;
    }

    @Override
    public Employee delete(int id) {
        return null;
    }
}
