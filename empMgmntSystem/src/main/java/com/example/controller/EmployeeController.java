package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Employee;
import com.example.exception.EmployeeNotFoundException;
import com.example.service.EmployeeService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController 
{

    @Autowired
    private EmployeeService service;

    @GetMapping("/getemp")
    public List<Employee> getAllEmployees() 
    {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) 
    {
    	
    	    Optional<Employee> employee = service.getEmployeeById(id);
    	    if (employee.isPresent()) {
    	        return employee.get();
    	    } else {
    	        throw new EmployeeNotFoundException(id);
    	    }
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Map<String, Object> updates) 
    {
        Employee emp = service.getEmployeeById(id)
            .orElseThrow(() -> new EmployeeNotFoundException(id));

        if (updates.containsKey("name")) 
        {
            emp.setName(updates.get("name").toString());
        }
        if (updates.containsKey("email")) 
        {
            emp.setEmail(updates.get("email").toString());
        }
        if (updates.containsKey("department")) 
        {
            emp.setDepartment(updates.get("department").toString());
        }
        if (updates.containsKey("salary")) 
        {
            emp.setSalary(Double.parseDouble(updates.get("salary").toString()));
        }

        return ResponseEntity.ok(service.createEmployee(emp));
    }

    

    @PostMapping("/addemp")
    public Employee createEmployee(@RequestBody Employee employee) 
    {
        return service.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) 
    {
        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) 
    {
        service.deleteEmployee(id);
    }
}

