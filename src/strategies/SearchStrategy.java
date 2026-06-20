package strategies;

import models.Employee;

import java.util.List;

public interface SearchStrategy
{
    public Employee search(List<Employee> employees, String keyword);
}
