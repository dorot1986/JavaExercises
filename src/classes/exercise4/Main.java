package classes.exercise4;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Napisz program, w którym utworzysz dwie klasy:
        ● Employee - klasa, która będzie przedstawiała pracownika dowolnej firmy.
        Podstawowe informacje o pracowniku jakie są potrzebne pracodawcy to imię,
        nazwisko, rok urodzenia, staż pracy
        ● Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników, a
        następnie wyświetlisz informację o nich na ekranie*/


public class Main {
    public static void main(String[] args) {
        Company company1 = new Company();
        System.out.println(company1.employee1.showInfo());
        System.out.println(company1.employee2.showInfo());
        System.out.println(company1.employee3.showInfo());
        System.out.println(company1.employee4.showInfo());
    }
}
