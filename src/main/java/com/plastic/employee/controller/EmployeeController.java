package com.plastic.employee.controller;

import com.plastic.employee.model.Employee;
import com.plastic.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/employees"})
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> list() {
        return employeeService.list();
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }
}
