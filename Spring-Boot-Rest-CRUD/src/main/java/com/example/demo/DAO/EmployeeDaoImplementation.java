package com.example.demo.DAO;

import com.example.demo.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDaoImplementation implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("From Employee", Employee.class);
        return theQuery.getResultList();
    }

    @Override
    public Employee findByID(int id) {
        return entityManager.find(Employee.class,id);
    }

    @Override
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public void deleteById(int id) {
        Employee myEmployee = entityManager.find(Employee.class,id);
        entityManager.remove(myEmployee);
    }
}
