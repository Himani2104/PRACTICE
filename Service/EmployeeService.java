package com.example.Restful.WebServices.Part1.Service;

import com.example.Restful.WebServices.Part1.EmployeeBean.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private static List<Employee> employees=new ArrayList<>();
    private static int idCount=0;
    static {

        employees.add(new Employee(++idCount,"Himani",20));
                employees.add(new Employee(++idCount,"Shreya",21));
                employees.add(new Employee(++idCount,"Riya",21));
                employees.add(new Employee(++idCount,"Versha",23));
    }

    public Employee addNewEmployee(Employee employee)
    {
        employee.setEmpId(++idCount);
        employees.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployees()
    {
        return employees;
    }

    public Employee getEmployeeById(int id)
    {

        return employees.stream().filter(e -> e.getEmpId()==id).findFirst().orElse(null);
    }


    public void updateEmployee(Employee employee,int id)
    {
       employees= employees.stream().map(emp->{
            if (emp.getEmpId()==id)
            {
                emp.setEmpName(employee.getEmpName());
                emp.setAge(employee.getAge());
            }
            return emp;
        }).collect(Collectors.toList());


    }

    public void removeEmployeeById(int id)
    {
       employees= employees.stream().filter(emp-> emp.getEmpId()!=id).collect(Collectors.toList());

    }


}
