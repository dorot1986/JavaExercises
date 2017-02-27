package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Napisz funkcję add wyznaczającą sumę dwóch zadanych liczb całkowitych. Napisz program
wykorzystujący funkcję add.*/


public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("----Program oblicza sumę dwóch liczb całkowitych----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Podaj dwie liczby całkowite:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Suma liczb to: " + add(a, b));
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }

    public static int add (int a, int b){
        return a+b;
    }
}
