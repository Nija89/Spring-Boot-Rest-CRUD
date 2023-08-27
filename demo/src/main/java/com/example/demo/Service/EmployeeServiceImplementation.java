package com.example.demo.Service;

import com.example.demo.DAO.EmployeeDAO;
import com.example.demo.Entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImplementation implements EmployeeService{
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImplementation(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findByID(int id) {
        return employeeDAO.findByID(id);
    }
    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }
    @Transactional
    @Override
    public void deleteById(int id) {
        employeeDAO.deleteById(id);
    }
}
