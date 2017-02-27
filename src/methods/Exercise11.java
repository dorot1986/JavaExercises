package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Napisz funkcję, która odczytuje jako argument liczbę i wypisuje liczbę dzielników.*/


public class Exercise11 {
    public static void main(String[] args) {
        System.out.println("----Program oblicza liczbę dzielników podanej liczby całkowitej----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Podaj liczbę całkowitą:");
            int a = sc.nextInt();
            System.out.println("Liczba dzielników liczby " + a + " to: " + numberOfDividers(a));
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }

    public static int numberOfDividers(int a){
        int sum=0;
        if (a>0){
            for (int i=1; i<=a; i++){
                if (a%i==0) sum ++;
            }
        }
        else if (a==0) sum=0;
        else{
            for (int i=1; i<=-a; i++){
                if (a%i==0) sum ++;
            }
        }
        return sum;
    }
}
