package com.rest.restCRUDemo.controller;

import com.rest.restCRUDemo.entity.Employee;
import com.rest.restCRUDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MyRestController {
    private final EmployeeService employeeService;

    @Autowired
    public MyRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("employees")
    public List<Employee> showAllEmployee(){
        return employeeService.findAll();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getById(id);
    }

    @PostMapping("employees")
    public Employee createEmployee(@RequestBody Employee newEmployee){
        newEmployee.setId(0);
        return employeeService.save(newEmployee);
    }


    @PutMapping("employees")
    public Employee updateEmployee(@RequestBody Employee newEmployee){
        return employeeService.save(newEmployee);
        }

    @DeleteMapping("employees/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        Employee currentEmployee = employeeService.getById(id);
        employeeService.deleteById(id);
        return currentEmployee.getFirstName() + " has been successfully deleted";
    }

}
