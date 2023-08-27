package com.example.demo.Controller;

import com.example.demo.Entity.Employee;
import com.example.demo.ExceptionHandler.ErrorHandler;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    private EmployeeService employeeService;

    @Autowired
    public RestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId){
        Employee myEmployee =  employeeService.findByID(employeeId);
        if(myEmployee == null){
            throw new ErrorHandler("Employee Id is not found " + employeeId);
        }
        return myEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        return employeeService.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable  int employeeId){
        Employee myEmployee =  employeeService.findByID(employeeId);
        if(myEmployee == null){
            throw new ErrorHandler("Employee id is not found " + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Deleted: " + myEmployee;
    }
}
