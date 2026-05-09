package com.company.employee.service;

import com.company.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
Employee createEmployee(Employee employee);

List<Employee> getAllEmployees();

Employee getEmployeeById(Long id);

Employee updateEmployee(Long id, Employee updatedEmployee);

void deleteEmployee(Long id);
}
