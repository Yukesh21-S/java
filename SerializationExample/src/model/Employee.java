package model;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String department;
	private transient int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}
	
	public String toString()
	{
		return this.name+" "+this.department+" "+this.age;
	}
	

	
}
