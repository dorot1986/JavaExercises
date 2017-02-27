package classes.exercise1;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Person {
    String name;
    String surname;
    int age;
    Gender gender;

    public Person(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
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

    public void show(){
        System.out.println("Imię: " + this.getName() + "; Nazwisko: " + this.getSurname() + "; Wiek: " + this.getAge() + "; Płeć: " + this.getGender());
    }
}
