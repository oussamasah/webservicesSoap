package com.webservices.soap.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.webservices.soap.model.emp.Employee;

import jakarta.annotation.PostConstruct;
@Repository
public class EmployeeRepository {
	private static final Map<Integer, Employee> emps = new HashMap<>();

	@PostConstruct
	public void initData() {
		Employee emp1 = new Employee();
		emp1.setId(0);
		emp1.setFirstname("oussama");
		emp1.setLastname("test");
		emp1.setJobtitle("Developper Full-Stack");
		emps.put(emp1.getId(), emp1);

		Employee emp2 = new Employee();
		emp2.setId(1);
		emp2.setFirstname("samir");
		emp2.setLastname("test");
		emp2.setJobtitle("Developper FrontEnd");
		emps.put(emp2.getId(), emp2);

		Employee emp3 = new Employee();
		emp3.setId(2);
		emp3.setFirstname("maher");
		emp3.setLastname("test");
		emp3.setJobtitle("Developper BackEnd");
		emps.put(emp3.getId(), emp3);

	}

	public Employee findEmp(int id) {
		return emps.get(id);
	}
}
