package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest
        liczbą pierwszą.*/


public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("----Program sprawdza, czy podana liczba całkowita jest liczbą pierwszą----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Podaj liczbę całkowitą:");
            int a = sc.nextInt();
            if (isPrimeNumber(a)){
                System.out.println("Podana liczba jest liczbą pierwszą.");
            }
            else{
                System.out.println("Podana liczba nie jest liczbą pierwszą.");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }

    public static boolean isPrimeNumber (int a){
        int check = 0;
        if (a>1){
            for (int i=2; i<=a; i++){
                if (a%i==0){
                    check=check+1;
                }
            }
            if (check==1){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }
}
