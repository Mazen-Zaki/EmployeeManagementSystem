import database.EmployeeManager;
import enums.SeniorityLevel;
import enums.TechStack;
import models.Developer;
import models.Intern;
import models.Manager;

import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        // Polymorphism — all stored as models.Employee type


        Developer dev = new Developer("Mazen", "Zaki", "mazen@email.com", 24,
                1, 10000, "Engineering", 0,
                SeniorityLevel.MID, List.of(TechStack.JAVA, TechStack.DOCKER));

        Manager mgr = new Manager("Ahmed", "Ali", "ahmed@email.com", 35,
            2, 15000, "Engineering", 0,
            5, 20.0);


        Intern intern = new Intern("Sara", "Mohamed", "sara@email.com", 21,
                3, 3000, "Engineering", 0,
                dev, LocalDate.now(), LocalDate.now().plusMonths(6));

        EmployeeManager manager = EmployeeManager.getInstance();

        manager.addEmployee(dev);
        manager.addEmployee(mgr);
        manager.addEmployee(intern);

        manager.printAll();

        System.out.println("Found: " + manager.findEmployee(1).getRole());

        manager.removeEmployee(2);
        System.out.println("After removing Manager:");
        manager.printAll();
    }
}
