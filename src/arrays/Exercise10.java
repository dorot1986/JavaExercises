package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-25.
 */

/*Wprowadź liczby całkowite do dwuwymiarowej tablicy liczb o wymiarach n wierszy i m
kolumn ( n i m zadeklarowane jako stałe w programie) oraz oblicz sumę wyrazów w tablicy.
        Znajdź minimum i maksimum w wierszach tablicy dwuwymiarowej.*/


public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Podaj wymiary tablicy dwuwymiarowej liczb całkowitych:");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] array = new int[n][m];
            for (int i = 0; i <= n - 1; i++) {
                System.out.println("Podaj elementy " + (i + 1) + " wiersza tablicy dwuwymiarowej:");
                for (int j = 0; j <= m-1; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
            int sum = 0;
            for (int i = 0; i <= n - 1; i++) {
                int min = array[i][0];
                int max = array[i][0];
                for (int j = 0; j <= m-1; j++) {
                    sum = sum + array[i][j];
                    if (array[i][j]<min) min=array[i][j];
                    if (array[i][j]>max) max=array[i][j];
                }
                System.out.println("Minimum w " + (i + 1) + " wierszu tablicy to: " + min);
                System.out.println("Maksimum w " + (i + 1) + " wierszu tablicy to: " + max);
                System.out.println("------------------------------");
            }
            System.out.println("Suma liczb w tablicy to: " + sum);
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();

    }
}
