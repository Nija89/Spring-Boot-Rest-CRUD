package com.rest.restCRUDemo.service;

import com.rest.restCRUDemo.dao.EmployeeDAO;
import com.rest.restCRUDemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeDAO employeeDAO;
    public EmployeeServiceImpl(EmployeeDAO EmployeeDAO){
        this.employeeDAO = EmployeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public Employee getById(int myId) {
        return employeeDAO.getById(myId);
    }


    @Override
    @Transactional
    public void deleteById(int myId) {
        employeeDAO.deleteById(myId);
    }
}
