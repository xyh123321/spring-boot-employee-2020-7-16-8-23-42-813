package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/employees")
    public void addEmployee(@RequestBody() Employee employee) {
        employeeServiceImpl.addEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> searchEmployees(){
        return employeeServiceImpl.searchEmployees();
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable("id") int id){
        employeeServiceImpl.deleteEmployee(id);
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable("id") int id, @RequestBody() Employee employee){
        employeeServiceImpl.updateEmployee(id, employee);
    }
}
