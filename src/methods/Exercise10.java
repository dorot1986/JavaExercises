package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Napisz funkcję, która wyznacza maksimum z dwóch zadanych liczb całkowitych. Wartością
        funkcji ma być większa spośród liczb.*/


public class Exercise10 {
    public static void main(String[] args) {
        System.out.println("----Program wyznacza maksimum z dwóch podanych liczb całkowitych----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Podaj dwie liczby całkowite:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Maksimum to: " + max(a, b));
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }

    public static int max (int a, int b){
        if (a>b) return a;
        else return b;
    }
}
