package models;

import calculators.ManagerSalaryCalculator;
import calculators.SalaryCalculator;
import promotions.ManagerPromotion;
import promotions.Promotable;

public class Manager extends Employee
{
    private int teamSize;
    private double bonusPercentage;


    public Manager(String firstName, String lastName, String email, int age, int employeeID,
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

    public void setBonusPercentage(double bonusPercentage)
    {
        this.bonusPercentage = bonusPercentage;
    }

    protected int getTeamSize()
    {
        return teamSize;
    }

    public double getBonusPercentage()
    {
        return bonusPercentage;
    }

    public void promote()
    {
        Promotable promotion = new ManagerPromotion(this);
        promotion.promote();
    }

    @Override
    public double calculateSalary()
    {
        SalaryCalculator calc = new ManagerSalaryCalculator();
        return calc.calculate(getBaseSalary(),bonusPercentage);
    }

    @Override
    public String getRole()
    {
        return "Manager";
    }
}
