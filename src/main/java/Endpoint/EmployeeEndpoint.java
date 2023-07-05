package Endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.webservices.soap.model.emp.GetEmployeeRequest;
import com.webservices.soap.model.emp.GetEmployeeResponse;


import repository.EmployeeRepository;

@Endpoint
public class EmployeeEndpoint {
	private static final String NAMESPACE_URI = "http://www.webservice.com/model/emp";
	private EmployeeRepository empRepository;

	@Autowired
	public EmployeeEndpoint(EmployeeRepository eRepo) {
		this.empRepository = eRepo;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeRequest")
	@ResponsePayload
	public GetEmployeeResponse getEmployee(@RequestPayload GetEmployeeRequest request) {

		GetEmployeeResponse response = new GetEmployeeResponse();
		response.setEmployee(empRepository.findEmp(request.getId()));
		return response;
	}
}
