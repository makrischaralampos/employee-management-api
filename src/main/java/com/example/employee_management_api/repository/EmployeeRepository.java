package com.example.employee_management_api.repository;

import com.example.employee_management_api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartment(String department);
    List<Employee> findByEmail(String email);
    List<Employee> findByDepartmentAndEmail(String department, String email);
}
