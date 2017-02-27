package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Napisz funkcję, która ma trzy parametry formalne a, b, c będące liczbami całkowitymi.
        Funkcja zwraca prawdę, jeśli zadane liczby są liczbami pitagorejskimi oraz fałsz w
        przeciwnym wypadku. Liczby pitagorejskie spełniają warunek: a *a+b*b=c*c.*/


public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("----Program sprawdza, czy podane liczby są liczbami pitagorejskimi----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Podaj 3 liczby całkowite:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(checkIfPythagorean(a, b, c)==true){
                System.out.println("Podane liczby są liczbami pitagorejskimi.");
            }
            else{
                System.out.println("Podane liczby nie są liczbami pitagorejskimi.");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }

    public static boolean checkIfPythagorean (int a, int b, int c){
        if (a*a+b*b==c*c) return true;
        else return false;
    }
}
