package com.test;

public class Employee {
	
	private String name;
	private String cmp;
	private String salary;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, String cmp, String salary)
	{
		this.name = name;
		this.cmp = cmp;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
