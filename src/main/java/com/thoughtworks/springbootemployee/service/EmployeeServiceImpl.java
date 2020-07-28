package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> dataBase = new ArrayList<>();

    public void addEmployee(Employee employee) {
        if(dataBase.stream().filter(dataBaseEmployee -> employee.getId() == dataBaseEmployee.getId()).findFirst().orElse(null) == null){
            dataBase.add(employee);
        }
    }

    public List<Employee> searchEmployees() {
        return dataBase;
    }

    public void deleteEmployee(int id) {
        dataBase.remove(dataBase.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null));
    }

    public void updateEmployee(int id, Employee employee) {
        deleteEmployee(id);
        addEmployee(employee);
    }

    @Override
    public Employee searchEmployee(int id) {
        return dataBase.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
    }
}
