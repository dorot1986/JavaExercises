package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Napisz funkcję divide wyznaczającą iloraz dwóch zadanych liczb całkowitych. Działanie
        funkcji sprawdź pisząc odpowiedni program.
        Dla chętnych *- Napisz funkcję z obsługą błędów.*/


public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("----Program oblicza iloraz dwóch liczb całkowitych----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Podaj dwie liczby całkowite:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            divide(a, b);
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();

    }
    public static void divide (int a, int b){
        if (b!=0){
            double result = (double) a/b;
            System.out.println("Iloraz liczb to: " + result);
        }
        else{
            System.out.println("Nie dziel przez 0!");
        }
    }
}
