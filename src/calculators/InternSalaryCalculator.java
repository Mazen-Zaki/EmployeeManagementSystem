package calculators;

public class InternSalaryCalculator implements SalaryCalculator
{
    public InternSalaryCalculator()
    {}

    @Override
    public double calculate(int baseSalary, double multiplier)
    {
        return baseSalary;
    }
}
