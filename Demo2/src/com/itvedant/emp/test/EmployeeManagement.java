package com.itvedant.emp.test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.itvedant.emp.models.Employee;
import com.itvedant.emp.repository.Employeedao;
import com.itvedant.emp.repository.employeeDaoImp;

public class EmployeeManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Employeedao dao = new employeeDaoImp();
		while (true) {
			System.out.println("====== Employee Management ======");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee \n3.Delete Employee");
			System.out.println("4.Search Employee by id \n5. Display all Employee \n6.Exit");
			System.out.println("Please enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
				case 1: // Insert
					System.out.println("plz enter name,dept and salary");
					// int id = sc.nextInt();
					sc.nextLine();
					String name = sc.nextLine();
					String dept = sc.next();
					int salary = sc.nextInt();
					Employee e = new Employee(name, dept, salary);
					System.out.println(e);
					boolean response = dao.addEmployee(e);
					if (response)
						System.out.println("employee added succesfully");
					else
						System.err.println("Sorrry!! employee is not added");
					break;
				case 2: // update
					break;
				case 3: // delete

					System.out.print("Enter Employee ID: ");
					int deleteId = sc.nextInt();

					boolean response1 = dao.deleteEmployeeById(deleteId);

					if (response1) {
						System.out.println("Employee deleted successfully.");
					} else {
						System.out.println("Sorry!! This Employee ID does not exist.");
					}
					break;

				case 4: // get by id
					System.out.print("Enter Employee ID to search: ");
					int searchId = sc.nextInt();

					Employee searchEmployee = dao.getEmployeeById(searchId);

					if (searchEmployee != null) {
						System.out.println(searchEmployee);
					} else {
						System.out.println("Employee not found.");
					}

					break;
					

				case 5: // display all
					List<Employee> allEmployees = dao.getAllEmployees();
					Iterator<Employee> itr = allEmployees.iterator();
					while (itr.hasNext()) {
						System.out.println(itr.next());
					}
					break;

				case 6: // exit
					System.out.println("Thank you for Using employee management");
					System.exit(0);
					break;
				default:
					System.out.println("Please enter the valid choice: ");
			}
		}
	}
}