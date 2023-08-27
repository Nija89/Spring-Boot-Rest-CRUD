package com.example.demo.DAO;

import com.example.demo.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findByID(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
