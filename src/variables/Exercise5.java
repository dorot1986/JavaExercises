package variables;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-21.
 */

//Stwórz program, który odczytuje wiek danej osoby i wypisuję na ekran komunikat
//        czy dana osoba jest pełnoletnia czy niepełnoletnia.
//        Dla chętnych: stwórz obsługę sytuacji, gdy podane są niepoprawne dane.
//        Dla chętnych: dodaj obsługę wyjątków.


public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swój wiek (w latach):");
        try {
            int age = sc.nextInt();
            if (age>=18 && age<=120){
                System.out.println("Jesteś osobą pełnoletnią.");
            }
            else if (age<18 && age>=0){
                System.out.println("Jesteś osobą niepełnoletnią.");
            }
            else {
                System.out.println("Podałeś niepoprawny wiek!");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Podałeś niepoprawne dane!");
        }
        sc.close();

    }
}
