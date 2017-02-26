package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-24.
 */

//Dla danej tablicy liczb całkowitych oblicz średnią arytmetyczną oraz sumę ciągu.


public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy liczb całkowitych:");
        try{
            int n = sc.nextInt();
            int[] array = new int[n];
            System.out.println("Podaj elementy tablicy:");
            for (int i=0; i<=n-1; i++){
                array[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i=0; i<=n-1; i++){
                sum = sum + array[i];
            }
            System.out.println("Średnia arytmetyczna liczb to: " + (double)sum/n);
            System.out.println("Suma liczb to: " + sum);
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }
}
