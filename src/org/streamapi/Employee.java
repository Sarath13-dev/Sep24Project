package org.streamapi;
//POJO Class - Table - 3 columns - EmpName, EmpSalary, EmpAge
public class Employee {
	
	private String name;
	
	private int salary;
	
	private int age;

	
	
	
	
	
	
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, int salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	
	

}
