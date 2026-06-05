import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Intern extends Employee
{
    private Developer mentor;
    private LocalDate startDate;
    private LocalDate endDate;

    public Intern(String firstName, String lastName, String email, int age,
                  int employeeID, int baseSalary, String department, int bonus,
                  Developer mentor, LocalDate startDate, LocalDate endDate)
    {
        super(firstName, lastName, email, age, employeeID, baseSalary, department, bonus);
        this.mentor = mentor;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    protected void setMentor(Developer mentor)
    {
        this.mentor = mentor;
    }

    protected void setInternshipStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }

    protected void setInternshipEndDate(LocalDate endDate)
    {
        this.endDate = endDate;
    }

    protected long getDurationInDays()
    {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    protected long getDurationInMonths()
    {
        return ChronoUnit.MONTHS.between(startDate, endDate);
    }

    protected Developer getMentor()
    {
        return mentor;
    }
}
