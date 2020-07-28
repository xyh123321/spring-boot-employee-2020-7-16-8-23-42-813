package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);

    List<Employee> searchEmployees();

    void deleteEmployee(int id);

    void updateEmployee(int id, Employee employee);

    Employee searchEmployee(int id);
}
