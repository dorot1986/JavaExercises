package classes.exercise4;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Employee {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int seniorityYears;

    public Employee(String name, String surname, int yearOfBirth, int seniorityYears) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.seniorityYears = seniorityYears;
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

    public String showInfo(){
        return "Imię: " + name + "; Nazwisko: " + surname + "; Rok urodzenia: " + yearOfBirth + "; Staż pracy (lata): " +seniorityYears;
    }
}
