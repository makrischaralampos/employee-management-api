package com.example.employee_management_api.service;

import com.example.employee_management_api.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees(String department, String email);
    Employee getEmployeeById(Long id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
