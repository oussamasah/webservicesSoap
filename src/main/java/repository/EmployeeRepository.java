package repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;

import com.webservices.soap.model.emp.Employee;

import jakarta.annotation.PostConstruct;

public class EmployeeRepository {
	private static final Map<Integer, Employee> emps = new HashMap<>();

	@PostConstruct
	public void initData() {
		Employee emp1 = new Employee();
		emp1.setId(0);
		emp1.setName("oussama");
		emp1.setSalary(2500);
		emp1.setJob("Developper Full-Stack");
		emps.put(emp1.getId(), emp1);

		Employee emp2 = new Employee();
		emp2.setId(1);
		emp2.setName("samir");
		emp2.setSalary(2000);
		emp2.setJob("Developper FrontEnd");
		emps.put(emp2.getId(), emp2);

		Employee emp3 = new Employee();
		emp3.setId(2);
		emp3.setName("maher");
		emp3.setSalary(2000);
		emp3.setJob("Developper BackEnd");
		emps.put(emp3.getId(), emp3);

	}

	public Employee findEmp(int id) {
		Assert.notNull(id, "The Employee name must not be null");
		return emps.get(id);
	}
}
