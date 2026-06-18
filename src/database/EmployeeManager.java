package database;

import models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager
{
    private static EmployeeManager instance;
    private List<Employee> employees;

    private EmployeeManager()
    {
        employees = new ArrayList<>();
    }


    public static EmployeeManager getInstance()
    {
        if(instance == null)
        {
            instance =  new EmployeeManager();
        }

        return instance;
    }


    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    public void removeEmployee(int employeeID)
    {
        Employee emp = findEmployee(employeeID);
        if (emp == null)
            System.out.println("Employee not found - 404");
        else
            employees.remove(emp);
    }

    public Employee findEmployee(int employeeID)
    {
        for (Employee emp : employees)
        {
            if(emp.getEmployeeID() == employeeID)
                return emp;
        }
        return null;
    }

    public void printAll()
    {
        for (Employee emp : employees)
        {
            System.out.println("Role: " + emp.getRole());
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println("---");
        }
    }

}
