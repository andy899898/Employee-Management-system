package com.itvedant.emp.repository;

import java.util.List;
import com.itvedant.emp.models.Employee;

public interface Employeedao {

    boolean addEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployeeById(int id);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployees();
}