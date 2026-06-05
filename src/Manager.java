public class Manager extends Employee
{
    private int teamSize;
    private double bonusPercentage;


    Manager(String firstName, String lastName, String email, int age, int employeeID,
            int baseSalary, String department, int bonus, int teamSize, double bonusPercentage)
    {
        super(firstName, lastName, email, age, employeeID, baseSalary, department, bonus);
        this.teamSize = teamSize;
        this.bonusPercentage = bonusPercentage;
    }

    protected void setTeamSize(int teamSize)
    {
        this.teamSize = teamSize;
    }

    protected void setBonusPercentage(double bonusPercentage)
    {
        this.bonusPercentage = bonusPercentage;
    }

    protected int getTeamSize()
    {
        return teamSize;
    }

    protected double getBonusPercentage()
    {
        return bonusPercentage;
    }
}
