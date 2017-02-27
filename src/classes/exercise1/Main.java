package classes.exercise1;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Stwórz klasę Osoba posiadającą następujące dane takie jak:
        - name,
        - surname,
        - age,
        - gender.
        Stwórz odpowiedni konstruktor, który przyjmuje wszystkie argumenty. Dodaj metody
        dostępowe do zmiennych obiektu. Stwórz przykładowe obiekty.*/


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Adam", "Kowalski", 21, Gender.MĘŻCZYZNA);
        Person person2 = new Person("Anna", "Nowak", 20, Gender.KOBIETA);
        Person person3 = new Person("Jan", "Kwiecień", 32, Gender.MĘŻCZYZNA);
        Person person4 = new Person("Magdalena", "Maj", 30, Gender.KOBIETA);

        person1.show();
        person2.show();
        person3.show();
        person4.show();
    }

}
