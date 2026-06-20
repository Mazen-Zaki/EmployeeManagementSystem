package strategies;

import models.Employee;

import java.util.List;

public class SearchByDepartment implements SearchStrategy
{

    @Override
    public Employee search(List<Employee> employees, String keyword)
    {
        for (Employee emp : employees)
        {
            if(emp.getDepartment().equals(keyword))
                return emp;
        }
        return null;
    }
}
