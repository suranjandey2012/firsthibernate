package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="EMPLOYEE_DETAILS")
public class Employee {
    @Id
	private String EmployeeId;
    private String Employeename;
	private int salary;
	
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeename() {
		return Employeename;
	}
	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
