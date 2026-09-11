package com.itvedant.emp.repository;

import java.util.List;

import com.itvedant.emp.models.Employee;

public class Employeedao {
    public boolean addEmployee(Employee employee);

    public boolean updateEmployee(Employee employee); // full update

    public boolean deleteEmployeeById(int id);

    public Employee getEmployeeById(int id);// returns null or Employee obj
    public List<Employee> getAllEmployee();
}
