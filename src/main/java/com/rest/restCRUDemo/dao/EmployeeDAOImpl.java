package com.rest.restCRUDemo.dao;

import com.rest.restCRUDemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    private final EntityManager entityManager;
    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager){
        this.entityManager = theEntityManager;
    }
    @Override
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);
        return theQuery.getResultList();
    }

    @Override
    public Employee getById(int myId) {
        TypedQuery<Employee> theQuery = entityManager.createQuery("SELECT u FROM Employee u WHERE id=:x", Employee.class);
        theQuery.setParameter("x", myId);
        return theQuery.getSingleResult();
    }


    @Override
    public void deleteById(int myId) {
        entityManager.remove(getById(myId));
    }
}
