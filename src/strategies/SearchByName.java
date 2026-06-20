package strategies;

import models.Employee;

import java.util.List;

public class SearchByName implements SearchStrategy
{
    @Override
    public Employee search(List<Employee> employees, String keyword)
    {
        for (Employee emp : employees)
        {
            if(emp.getFirstname().equals(keyword))
                return emp;
        }
        return null;
    }
}
