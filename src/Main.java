import enums.SeniorityLevel;
import enums.TechStack;
import models.Developer;
import models.Employee;
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
        Employee[] employees = new Employee[3];

        employees[0] = new Developer("Mazen", "Zaki", "mazen@email.com", 24,
                1, 10000, "Engineering", 0,
                SeniorityLevel.MID, List.of(TechStack.JAVA, TechStack.DOCKER));

        Developer dev = (Developer) employees[0];

        employees[1] = new Manager("Ahmed", "Ali", "ahmed@email.com", 35,
                2, 15000, "Engineering", 0,
                5, 20.0);

        Manager manager = (Manager) employees[1];

        employees[2] = new Intern("Sara", "Mohamed", "sara@email.com", 21,
                3, 3000, "Engineering", 0,
                (Developer) employees[0], LocalDate.now(), LocalDate.now().plusMonths(6));

        // Polymorphism in action — same loop, different behavior
        for (Employee emp : employees)
        {
            System.out.println("Role: " + emp.getRole());
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println("---");
        }

        // Before promotion
        System.out.println("Before: " + dev.getRole() + " | Salary: " + dev.calculateSalary());
        dev.promote();
        // After promotion
        System.out.println("After: " + dev.getRole() + " | Salary: " + dev.calculateSalary());

        System.out.println("---");

        System.out.println("Before: " + manager.getRole() + " | Salary: " + manager.calculateSalary());
        manager.promote();
        System.out.println("After: " + manager.getRole() + " | Salary: " + manager.calculateSalary());
    }
}
