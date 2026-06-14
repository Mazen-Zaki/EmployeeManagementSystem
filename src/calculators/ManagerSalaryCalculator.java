package calculators;

public class ManagerSalaryCalculator implements SalaryCalculator
{
    public ManagerSalaryCalculator()
    {}

    @Override
    public double calculate(int baseSalary, double bonusPercentage)
    {
        return baseSalary + (baseSalary * bonusPercentage / 100);
    }


}
