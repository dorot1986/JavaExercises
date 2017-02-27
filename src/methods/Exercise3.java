package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Napisz funkcję multiply wyznaczającą iloczyn dwóch zadanych liczb całkowitych. Działanie
        funkcji sprawdź pisząc odpowiedni program.*/


public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("----Program oblicza iloczyn dwóch liczb całkowitych----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Podaj dwie liczby całkowite:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Iloczyn liczb to: " + multiply(a, b));
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }

    public static int multiply (int a, int b){
        return a*b;
    }
}
