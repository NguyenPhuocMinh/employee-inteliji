package com.plastic.employee.service;

import com.plastic.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> list();

    Employee listId(int id);

    Employee create(Employee employee);

    Employee edit(Employee employee);

    Employee delete(int id);


}
