package models;

import calculators.DeveloperSalaryCalculator;
import calculators.SalaryCalculator;
import enums.SeniorityLevel;

import enums.TechStack;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee
{
    public SeniorityLevel seniorityLevel;
    private List<TechStack> techStack;


    public Developer(String firstName, String lastName, String email, int age, int employeeID, int baseSalary,
              String department, int bonus, SeniorityLevel seniorityLevel, List<TechStack> techStack)
    {
        super(firstName, lastName, email, age, employeeID, baseSalary, department, bonus);
        this.seniorityLevel = seniorityLevel;
        this.techStack = new ArrayList<>(techStack);
    }

    protected void setSeniorityLevel(SeniorityLevel seniorityLevel)
    {
        this.seniorityLevel = seniorityLevel;
    }

    protected void setTechStack(List<TechStack> techStack)
    {
        this.techStack = techStack;
    }

    protected SeniorityLevel getSeniorityLevel()
    {
        return seniorityLevel;
    }

    protected List<TechStack> getTechStack()
    {
        return new ArrayList<>(techStack);
    }

    protected void addTechStack(TechStack tech)
    {
        if (!techStack.contains(tech))
        {
            techStack.add(tech);
        }
    }

    protected void removeTechStack(TechStack tech)
    {
        if (techStack.contains(tech))
        {
            techStack.remove(tech);
        }
    }

    @Override
    public double calculateSalary()
    {
        SalaryCalculator calc = new DeveloperSalaryCalculator();
        double multiplier = switch (seniorityLevel)
        {
          case JUNIOR -> 1.0;
          case MID -> 1.3;
          case SENIOR -> 1.6;
        };

        return calc.calculate(getBaseSalary() , multiplier);
    }

    @Override
    public String getRole()
    {
        return "Developer - " + getSeniorityLevel().getDisplayName() + " Developer";
    }
}
