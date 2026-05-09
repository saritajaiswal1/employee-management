package com.company.employee.controller;

import com.company.employee.entity.Employee;
import com.company.employee.service.EmployeeService;
import com.company.employee.service.EmployeeServiceRestClient;
import com.company.employee.service.EmployeeServiceWebClient;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    private final EmployeeServiceRestClient restClient;
    private final EmployeeServiceWebClient webClient;

    public EmployeeController(EmployeeService service,EmployeeServiceWebClient webClient,EmployeeServiceRestClient restClient) {
        this.service = service;
        this.webClient=webClient;
        this.restClient=restClient;
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(service.createEmployee(employee));
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(service.getAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {

        return ResponseEntity.ok(service.getEmployeeById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return ResponseEntity.ok(service.updateEmployee(id,employee));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
        service.deleteEmployee(id);
        return ResponseEntity.ok("Employee deleted successfully");
    }

    @GetMapping("/webclient")
   public String callEmployeeServiceViaWebClient(){
        return webClient.getEmployees();
    }

    @GetMapping("/restTemplate")
    public String callEmployeeServiceViaRestTemplate(){
        return restClient.getEmployees();
    }

}
