package models;

import observes.Observable;
import observes.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee extends Person implements Observable
{

    private int employeeID;
    private String department;
    private int baseSalary;
    private int bonus;

    private List<Observer> observers = new ArrayList<>();


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


    @Override
    public void addObserver(Observer observe)
    {
        observers.add(observe);
    }


    @Override
    public void removeObserver(Observer observe)
    {
        observers.remove(observe);
    }


    @Override
    public void notifyObservers(String event)
    {
        for (Observer observer : observers)
        {
            observer.update(this, event);
        }
    }


    /* abstract classes */
    public abstract double calculateSalary();
    public abstract String getRole();
    public abstract void promote();
}
