package com.example.Restful.WebServices.Part1.Controller;


import com.example.Restful.WebServices.Part1.EmployeeBean.Employee;
import com.example.Restful.WebServices.Part1.Exceptions.EmployeeNotFoundException;
import com.example.Restful.WebServices.Part1.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Validated

public class EmployeeController {


        @Autowired
        EmployeeService employeeService;
        @GetMapping("/employees")
        public List<Employee> findAllEmployees()
        {
            return employeeService.getAllEmployees();
        }

        @GetMapping("/employees/{id}")

        public Employee getEmployee(@PathVariable int id)
        {
                Employee employee= employeeService.getEmployeeById(id);
                if (employee==null)
                    throw new EmployeeNotFoundException("id-"+id);
            return employee;
        }

      @PostMapping("/employees")
        public Employee createEmployees(@Valid @RequestBody Employee employee)
        {
          return   employeeService.addNewEmployee(employee);
        }

        @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id)
        {
            employeeService.removeEmployeeById(id);
        }

        @PutMapping("/employees/{id}")
    public Employee UpdateEmployee(@Valid @PathVariable int id,@RequestBody Employee employee)
        {

            employeeService.updateEmployee(employee,id);
            return employee;

        }




}
