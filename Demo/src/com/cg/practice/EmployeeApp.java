package com.cg.practice;

public class EmployeeApp 
{
public static void main(String[] args) {
	Employee emp=new Employee(101,"Abhijeet",400000);
	System.out.println(emp.getEmp_id());
	System.out.println(emp.getName());
	System.out.println(emp.getSalary());
}
}
class Employee
{
	private int emp_id;
	private String name;
	private int salary;
	public Employee(int emp_id, String name, int salary) {
		super();
	//	emp_id = emp_id;
	//	name = name;
	//	salary = salary;
// It appears that the local variable are shadowing the instance variable and hence this problem is also Knows as the Shadowing problem.		
	this.emp_id=emp_id;
	this.name=name;
	this.salary=salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}