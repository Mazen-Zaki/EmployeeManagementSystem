package models;

public abstract class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public Person(String firstName, String lastName, String email, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    protected void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    protected void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    protected void setAge(int age)
    {
        this.age = age;
    }

    protected void setEmail(String email)
    {
        this.email = email;
    }

    public String getFirstname()
    {
        return firstName;
    }

    protected String getLastName()
    {
        return lastName;
    }

    protected String getEmail()
    {
        return email;
    }

    protected int getAge()
    {
        return age;
    }
}
