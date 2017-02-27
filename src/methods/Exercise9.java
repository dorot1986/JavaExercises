package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest
        sześcianem pewnej liczby naturalnej.*/


public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("----Program sprawdza, czy podana liczba jest sześcianem pewnej liczby naturalnej----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Podaj liczbę całkowitą:");
            int a = sc.nextInt();
            if (isCubeNumber(a)){
                System.out.println("Podana liczba jest sześcianem liczby naturalnej.");
            }
            else{
                System.out.println("Podana liczba nie jest sześcianem liczby naturalnej.");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }

    public static boolean isCubeNumber(int a){
        int check = 0;
        for (int i=0; i<=a; i++){
            if (i*i*i==a){
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
