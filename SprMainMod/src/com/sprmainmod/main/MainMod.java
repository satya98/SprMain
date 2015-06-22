package com.sprmainmod.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sprmainmod.models.User;
import com.sprmainmod.services.EmployeeService;



public class MainMod {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		employeeService.checkEmployee(ctx.getBean("user", User.class));
		ctx.close();
	}
}