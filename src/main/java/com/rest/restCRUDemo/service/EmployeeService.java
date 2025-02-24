package com.rest.restCRUDemo.service;

import com.rest.restCRUDemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee save(Employee employee);

    Employee getById(int myId);

    void deleteById(int myId);
}
