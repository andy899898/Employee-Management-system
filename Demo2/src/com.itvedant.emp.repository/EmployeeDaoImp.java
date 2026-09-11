package com.itvedant.emp.repoistory;

import java.util.List;

import com.itvedat.emp.models.Employee;

public interface EmployeeDaoImp implements Employeedao {

    public boolean addEmployee(Employee employee){
          return false;
    }

    public boolean updateEmployee(Employee employee){
        return false;
    } // full update

    public boolean deleteEmployeeById(int id){
        return false;
    }

    public Employee getEmployeeById(int id);// returns null or Employee obj
    public List<Employee> getAllEmployee();
    
}
