package com.sprmainmod.services;

import com.sprmainmod.models.Employee;
import com.sprmainmod.models.User;


public class EmployeeService {

	private Employee employee;
	
	public Employee getEmployee(){
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}
	public void checkEmployee(User user){
		System.out.println("chk employee"+user);
		
	}
}
