package com.xyzcompany.controller;

import com.xyzcompany.dao.EmployeeDAO;
import com.xyzcompany.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @PostMapping
    public String saveEmployee(@RequestBody Employee employee) {
        employeeDAO.save(employee);
        return "Employee saved with id: " + employee.getId();
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable int id) {
        return employeeDAO.findById(id);
    }

    @GetMapping
    public List<Employee> findAllEmployees() {
        return employeeDAO.findAll();
    }
}
