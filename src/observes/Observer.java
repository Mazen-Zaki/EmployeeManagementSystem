package observes;

import models.Employee;

public interface Observer
{
    public void update(Employee employee, String event);
}
