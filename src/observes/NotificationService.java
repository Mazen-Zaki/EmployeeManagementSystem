package observes;

import models.Employee;

public class NotificationService implements Observer
{

    @Override
    public void update(Employee employee, String event)
    {
        if (event.equals("PROMOTED"))
        {
            System.out.println("[Notification] Congrats "
                    + employee.getFirstname() + "! You have been promoted to: " + employee.getRole());
        }
    }
}
