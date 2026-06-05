public class Employee extends Person
{
    private int employeeID;
    private String department;
    private int baseSalary;
    private int bonus;


    public Employee(String firstName, String lastName, String email, int age, int employeeID,
             int baseSalary, String department, int bonus)
    {
        super(firstName, lastName, email, age);
        this.employeeID = employeeID;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.department = department;
    }

    protected void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    protected void setBaseSalary(int baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    protected void setBonus(int bonus)
    {
        this.bonus = bonus;
    }

    protected void setDepartment(String department)
    {
        this.department = department;
    }

    protected int getEmployeeID()
    {
        return employeeID;
    }

    protected int getBaseSalary()
    {
        return baseSalary;
    }

    protected int getBonus()
    {
        return bonus;
    }

    protected String getDepartment()
    {
        return department;
    }
}
