package com.example.employee_management_api.repository;

import com.example.employee_management_api.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testSaveEmployee() {
        Employee employee = new Employee(null, "John", "Doe", "john.doe@example.com", "Engineering");
        Employee savedEmployee = employeeRepository.save(employee);

        assertNotNull(savedEmployee);
        assertNotNull(savedEmployee.getId());
    }

    @Test
    void testFindById() {
        Employee employee = new Employee(null, "Jane", "Smith", "jane.smith@example.com", "HR");
        Employee savedEmployee = employeeRepository.save(employee);

        Optional<Employee> foundEmployee = employeeRepository.findById(savedEmployee.getId());
        assertTrue(foundEmployee.isPresent());
    }

    @Test
    void testDeleteEmployee() {
        Employee employee = new Employee(null, "Mark", "Jones", "mark.jones@example.com", "Marketing");
        Employee savedEmployee = employeeRepository.save(employee);

        employeeRepository.deleteById(savedEmployee.getId());
        Optional<Employee> deletedEmployee = employeeRepository.findById(savedEmployee.getId());
        assertFalse(deletedEmployee.isPresent());
    }
}
