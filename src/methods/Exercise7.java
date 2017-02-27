package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest kwadratem
        pewnej liczby całkowitej. Liczby będące kwadratami liczb całkowitych to 1, 4, 9, 16 itd.
        Wartością funkcji ma być prawda, jeśli liczba spełnia warunek oraz fałsz w przeciwnym
        wypadku.*/


public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("----Program sprawdza, czy podana liczba jest kwadratem pewnej liczby całkowitej----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Podaj liczbę całkowitą:");
            int a = sc.nextInt();
            if (isSquareNumber(a)){
                System.out.println("Podana liczba jest kwadratem liczby całkowitej.");
            }
            else{
                System.out.println("Podana liczba nie jest kwadratem liczby całkowitej.");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }

    public static boolean isSquareNumber(int a){
        int check = 0;
        for (int i=0; i<=a; i++){
            if (i*i==a){
                check=check+1;
            }
        }
        if (check>0){
            return true;
        }
        else{
            return false;
        }
    }
}
