package com.wahyu.services;

import com.wahyu.model.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeServices
{
    private final Map<Integer, Employee> employeeMap = new HashMap<>();

    public boolean addEmployee(Employee employee)
    {
        if(employeeMap.get(employee.getId()) != null)
        {
            return false;
        }
        else
        {
            employeeMap.put(employee.getId(), employee);
            return true;
        }
    }
    public boolean updateEmployee(Employee employee)
    {
        if(employeeMap.get(employee.getId()) != null)
        {
            employeeMap.put(employee.getId(), employee);
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean deleteEmployee(int id)
    {
        if(employeeMap.get(id) == null)
        {
            return false;
        }
        else
        {
            employeeMap.remove(id);
            return true;
        }
    }
    public Employee getEmployee(int id)
    {
        return employeeMap.get(id);
    }
    public Employee[] getAllEmployee()
    {
        Set<Integer> ids = employeeMap.keySet();
        Employee[] employees = new Employee[ids.size()];
        int i = 0;
        for (Integer id : ids)
        {
            employees[i] = employeeMap.get(id);
            i++;
        }
        return employees;
    }
}
