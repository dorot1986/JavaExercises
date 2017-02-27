package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Napisz funkcję, która wyznacza sumę cyfr zadanej liczby całkowitej.*/


public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("----Program oblicza sumę cyfr podanej liczby całkowitej----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Podaj liczbę całkowitą:");
            int a = sc.nextInt();
            System.out.println("Suma cyfr podanej liczby to: " + sumOfDigits(a));
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }

    public static int sumOfDigits (int a){
        int sum = 0;
        for (int i=0; i<Integer.toString(a).length(); i++){
            sum = sum + Character.getNumericValue((Integer.toString(a).charAt(i)));
        }
        return sum;
    }
}
