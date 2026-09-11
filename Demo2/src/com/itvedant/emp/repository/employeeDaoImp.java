package com.itvedant.emp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itvedant.emp.models.Employee;

public class employeeDaoImp implements Employeedao {

	Connection connection;
	PreparedStatement preparedStatement;
	int rowCount;
	String query, user = "root", password = "root";
	String url = "jdbc:mysql://localhost:3306/employeecrud";
	boolean response;

	@Override
	public boolean addEmployee(Employee employee) {
		try {
			response = false;
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			query = "insert into employee (name, dept, salary)values (?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, employee.name);
			preparedStatement.setString(2, employee.dept);
			preparedStatement.setDouble(3, employee.salary);
			rowCount = preparedStatement.executeUpdate();
			if (rowCount == 1)
				response = true;
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeById(int id) {
		String sql = "DELETE FROM employee WHERE Emp_id = ?";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int rowCount = ps.executeUpdate();

			if (rowCount == 1) {
				con.close();
				return true;
			}

			con.close();

		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

		return false;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee emp = null;
		Employee employee = null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,user,password);
			query = "Select * from employee where Emp_id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			ResultSet resultSet = preparedStatement.executeQuery();

			 if (resultSet.next()) {

                employee = new Employee();

                employee.Emp_id = resultSet.getInt("emp_id");
                employee.name = resultSet.getString("name");
                employee.dept = resultSet.getString("dept");
                employee.salary = resultSet.getDouble("salary");
            
		}
	}
		//connection.close(); 
		
		catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }

        return employee;
    }

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployees = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			query = "Select * from employee";
			preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String dept = rs.getString(3);
				int salary = rs.getInt(4);
				Employee e = new Employee(id, name, dept, salary);
				allEmployees.add(e);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allEmployees;
	}

}