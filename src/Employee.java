public abstract class Employee extends Person
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



    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public void setBaseSalary(int baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public int getBaseSalary()
    {
        return baseSalary;
    }

    public int getBonus()
    {
        return bonus;
    }

    public String getDepartment()
    {
        return department;
    }

    /* abstract classes */
    public abstract double calculateSalary();
    public abstract String getRole();
}
