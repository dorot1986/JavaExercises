package variables;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-21.
 */

//Napisz program, który deklaruje 2 zmienne całkowite i na ekran wypisuje ich sumę.


public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dwie liczby całkowite:");
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a+b;

            System.out.println("Suma liczb to: " + c);

        }
        catch (InputMismatchException exception){
            System.out.println("Liczby muszą być całkowite!");
        }
        sc.close();
    }
}
