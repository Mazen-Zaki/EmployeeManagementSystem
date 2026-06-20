package database;

import models.Employee;
import strategies.SearchByID;
import strategies.SearchStrategy;

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
        Employee emp = search(new SearchByID(), String.valueOf(employeeID));
        if (emp == null)
            System.out.println("Employee not found - 404");
        else
            employees.remove(emp);
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

    public Employee search(SearchStrategy strategy, String keyword)
    {
        return strategy.search(employees, keyword);
    }

}
