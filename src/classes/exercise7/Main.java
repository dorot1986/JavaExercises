package classes.exercise7;

import classes.exercise1.Gender;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Z wcześniejszych ćwiczeń skorzystaj z definiowanej Osoby (Person), stwórz metodę
        statyczną getAllPeople zwracającą fullName wszystkich osób. Zdefiniuj metodę toString.*/


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Adam", "Kowalski", 21, Gender.MĘŻCZYZNA);
        Person person2 = new Person("Anna", "Nowak", 20, Gender.KOBIETA);
        Person person3 = new Person("Jan", "Kwiecień", 32, Gender.MĘŻCZYZNA);
        Person person4 = new Person("Magdalena", "Maj", 30, Gender.KOBIETA);
        System.out.println(Person.getAllPeople());

    }
}
