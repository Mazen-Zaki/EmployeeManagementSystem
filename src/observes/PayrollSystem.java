package observes;

import models.Employee;

public class PayrollSystem implements Observer
{

    @Override
    public void update(Employee employee, String event)
    {
        if(event.equals("PROMOTED"))
        {
            System.out.println("[Payroll] Recalculating salary for: "
                    + employee.getFirstname() + " | New Salary: " + employee.calculateSalary());
        }
    }
}
