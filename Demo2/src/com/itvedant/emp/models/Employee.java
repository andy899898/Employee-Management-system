package com.itvedant.emp.models;


public class Employee {

    public int id;
    public String name , dept;
    public double salary;
    public int Emp_id;

    public Employee(String name2, String dept2, int salary2){
        this.name = name2;
        this.dept = dept2;
        this.salary = salary2;
    }

    public Employee(int id,String name,String dept, int salary){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;

    }

    

    public Employee() {
        //TODO Auto-generated constructor stub
    }

    public String toString(){
        return "Employee {id =" +id +" name ="+ name +" dept ="+ dept + "salary ="+ salary + "]";
    }
}
