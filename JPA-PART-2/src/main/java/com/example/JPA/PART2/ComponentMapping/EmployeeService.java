package com.example.JPA.PART2.ComponentMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

   public Employee createNewEmployee(Employee employee)
    {

        return employeeRepository.save(employee);
    }
}
