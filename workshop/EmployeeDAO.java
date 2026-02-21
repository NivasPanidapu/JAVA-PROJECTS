package com.xyzcompany.dao;

import com.xyzcompany.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    void save(Employee employee);
    Employee findById(int id);
    List<Employee> findAll();
}
