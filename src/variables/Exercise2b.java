package variables;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-21.
 */

//Napisz program, który odczytuje 2 zmienne całkowite i zamienia je (bez używania zmiennej pomocniczej).


public class Exercise2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dwie liczby całkowite:");
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Twoje liczby zamienione miejscami to: " + b + " i " + a);

        }
        catch (InputMismatchException exception){
            System.out.println("Liczby muszą być całkowite!");
        }
        sc.close();
    }
}
