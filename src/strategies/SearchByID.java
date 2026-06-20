package strategies;

import models.Employee;

import java.util.List;

public class SearchByID implements SearchStrategy
{

    @Override
    public Employee search(List<Employee> employees, String keyword)
    {
        for (Employee emp : employees)
        {
            if(emp.getEmployeeID() == Integer.parseInt(keyword))
                return emp;
        }
        return null;
    }
}
