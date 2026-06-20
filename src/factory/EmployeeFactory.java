package factory;

import enums.SeniorityLevel;
import enums.TechStack;
import models.Developer;
import models.Employee;
import models.Intern;
import models.Manager;

import java.time.LocalDate;
import java.util.List;

public class EmployeeFactory
{
    private EmployeeFactory()
    {

    }

    /* Developer */
    public static Employee createEmployee(String firstName, String lastName, String email,
                                          int age, int employeeID, int baseSalary,
                                          String department, int bonus, SeniorityLevel seniorityLevel,
                                          List<TechStack> techStack)
    {
        return new Developer(firstName, lastName, email, age, employeeID, baseSalary, department, bonus, seniorityLevel, techStack);
    }

    /* Manager */
    public static Employee createEmployee(String firstName, String lastName, String email, int age, int employeeID,
                                          int baseSalary, String department, int bonus, int teamSize, double bonusPercentage) {
        return new Manager(firstName, lastName, email, age, employeeID, baseSalary, department, bonus, teamSize, bonusPercentage);
    }

    /* Intern */
    public static Employee createEmployee(String firstName, String lastName, String email, int age,
                                          int employeeID, int baseSalary, String department, int bonus,
                                          Developer mentor, LocalDate startDate, LocalDate endDate)
    {
        return new Intern(firstName, lastName, email, age, employeeID, baseSalary, department, bonus, mentor, startDate, endDate);
    }
}
