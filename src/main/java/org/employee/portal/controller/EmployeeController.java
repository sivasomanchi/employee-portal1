package org.employee.portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.employee.portal.domain.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= {"/employee"})
public class EmployeeController {
	
	@RequestMapping(path= {"/employees"}, method= RequestMethod.GET, produces = "application/json")
	public List<Employee> getEmployees(){
		Employee emp = new Employee("Supreeth","Tata","IT",0,"Srikanth");
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp);
		return list;
		
	}

}
