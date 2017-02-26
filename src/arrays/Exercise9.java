package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-25.
 */

//Dana jest liczba naturalna n z przedziału 1 do 100, ciąg n liczb całkowitych oraz liczba
//całkowita k. Napisz program, który w yznaczy ilość wystąpień liczby k w podanym ciągu liczb.


public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy liczb całkowitych:");
        try {
            int n = sc.nextInt();
            int[] array = new int[n];
            System.out.println("Podaj elementy tablicy:");
            for (int i = 0; i <= n - 1; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("Podaj liczbę, dla której chcesz zbadać liczbę wystąpień:");
            int k = sc.nextInt();
            int sum = 0;
            for (int i=0; i<=n-1; i++){
                if (array[i]==k){
                    sum = sum+1;
                }
            }
            System.out.println("Liczba wystąpień liczby " + k + " w podanym ciągu to: " + sum);
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
    }
}
