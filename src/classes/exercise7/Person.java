package classes.exercise7;

import classes.exercise1.Gender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Person {
    String name;
    String surname;
    int age;
    Gender gender;
    private static List<Person> people = new ArrayList<Person>();

    public Person(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        Person.people.add(this);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "Imię: " + this.getName() + "; Nazwisko: " + this.getSurname() + "; Wiek: " + this.getAge() + "; Płeć: " + this.getGender();
    }
    public String fullName(){
        return name + " " + surname;
    }

    public static List<String> getAllPeople(){
        List<String> people = new ArrayList<String>();
        for (Person p:Person.people) {
            people.add(p.fullName());
        }
        return people;
    }
}
