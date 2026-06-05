import enums.SeniorityLevel;

import enums.TechStack;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee
{
    private SeniorityLevel seniorityLevel;
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

    public void addTechStack(TechStack tech)
    {
        if (!techStack.contains(tech))
        {
            techStack.add(tech);
        }
    }

    public void removeTechStack(TechStack tech)
    {
        if (techStack.contains(tech))
        {
            techStack.remove(tech);
        }
    }
}
