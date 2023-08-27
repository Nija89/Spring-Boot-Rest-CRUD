package com.example.demo.Service;

import com.example.demo.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findByID(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
