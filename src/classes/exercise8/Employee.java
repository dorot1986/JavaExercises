package classes.exercise8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Employee {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int seniorityYears;
    private double sallary;
    private static List<Employee> employees = new ArrayList<Employee>();

    public Employee(String name, String surname, int yearOfBirth, int seniorityYears, double sallary) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.seniorityYears = seniorityYears;
        this.sallary = sallary;
        Employee.employees.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getSeniorityYears() {
        return seniorityYears;
    }

    public void setSeniorityYears(int seniorityYears) {
        this.seniorityYears = seniorityYears;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public String showInfo(){
        return "Imię: " + name + "; Nazwisko: " + surname + "; Rok urodzenia: " + yearOfBirth + "; Staż pracy (lata): " +seniorityYears;
    }

    public static double getSumOfAllSallaries(){
        List<Double> listOfAllSallaries = new ArrayList<Double>();
        double sumOfAllSallaries = 0;
        for (Employee e:Employee.employees) {
            sumOfAllSallaries = sumOfAllSallaries + e.sallary;
        }
        return sumOfAllSallaries;
    }
}
