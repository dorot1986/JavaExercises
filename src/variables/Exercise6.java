package variables;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Stwórz program, który odczytuję daną liczbę i sprawdza czy jest podzielna przez 4.


public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą:");
        try{
            int a = sc.nextInt();
            if (a%4==0){
                System.out.println("Podana liczba jest podzielna przez 4.");
            }
            else{
                System.out.println("Podana liczba nie jest podzielna przez 4.");
            }
        }
        catch(InputMismatchException exception){
            System.out.println("Podałeś niepoprawne dane!");
        }
        sc.close();
    }
}
