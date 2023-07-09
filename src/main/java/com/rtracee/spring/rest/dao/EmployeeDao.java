package com.rtracee.spring.rest.dao;

import com.rtracee.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployees();

    void addEmployee(Employee emp);

    Employee getEmployeeById(int id);

    void deleteEmployee(int id);
}
