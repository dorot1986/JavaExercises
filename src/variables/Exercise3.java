package variables;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-21.
 */

//Napisz program, który odczytuje liczbę typu double i na ekran wypisuje całkowitą
//        wartość tej liczby.


public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę typu double:");
        try {
            double a = sc.nextDouble();
            double b = a-a%1;
            System.out.println("Całkowita wartość tej liczby to: " + b);

        }
        catch (InputMismatchException exception){
            System.out.println("Liczba musi być typu double!");
        }
        sc.close();
    }
}
