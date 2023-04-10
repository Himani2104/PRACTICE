package com.example.JPA.PART2.ComponentMapping;

import com.example.JPA.PART2.InheritenceMapping.SingleTableStrategy.Card;
import com.example.JPA.PART2.InheritenceMapping.SingleTableStrategy.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
   EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee CreateEmployee(@RequestBody Employee employee)
    {

        return employeeService.createNewEmployee(employee);
    }
}
