package com.rest.restCRUDemo.dao;

import com.rest.restCRUDemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO  {
    Employee save(Employee employee);

    List<Employee> findAll();

    Employee getById(int myId);

    void deleteById(int myId);

}
