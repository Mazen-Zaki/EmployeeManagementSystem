package calculators;

public class DeveloperSalaryCalculator implements SalaryCalculator
{
    public DeveloperSalaryCalculator() {}

    @Override
    public double calculate(int baseSalary, double multiplier)
    {
        return baseSalary * multiplier;
    }

}
