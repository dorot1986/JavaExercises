package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-24.
 */

//Dla tablicy liczb całkowitych znajdź jednocześnie minimum i maksimum tablicy.


public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy liczb całkowitych:");
        try{
            int n = sc.nextInt();
            int[] numbers = new int[n];
            System.out.println("Podaj elementy tablicy:");
            for (int i=0; i<=n-1; i++){
                numbers[i] = sc.nextInt();
            }
            int min = numbers[0];
            for (int i=0; i<=n-2; i++){
                if (min>numbers[i+1]){
                    min = numbers[i+1];
                }
            }
            System.out.println("Liczba minimalna to: " + min);
            int max = numbers[0];
            for (int i=0; i<=n-2; i++){
                if (numbers[i+1]>max){
                    max = numbers[i+1];
                }
            }
            System.out.println("Liczba maksymalna to: " + max);
        }
        catch(InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }
}
