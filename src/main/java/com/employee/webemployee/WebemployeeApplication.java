package com.employee.webemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebemployeeApplication
{
	public static EmpList ourEmpList;

	public static void main(String[] args)
	{
		ourEmpList = new EmpList();
		SpringApplication.run(WebemployeeApplication.class, args);
	}

}
